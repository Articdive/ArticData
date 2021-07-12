package de.articdive.articdata.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Set;

public final class MaterialGenerator_1_16_5 extends DataGenerator_1_16_5<Item> {
    private static final Logger LOGGER = LoggerFactory.getLogger(MaterialGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : Items.class.getDeclaredFields()) {
            if (!Item.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                Item i = (Item) declaredField.get(null);
                names.put(i, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map item naming system.", e);
                return;
            }
        }
    }

    @Override
    public JsonObject generate() {
        Set<ResourceLocation> itemRLs = Registry.ITEM.keySet();
        JsonObject items = new JsonObject();

        for (ResourceLocation itemRL : itemRLs) {
            Item i = Registry.ITEM.get(itemRL);

            JsonObject item = new JsonObject();
            item.addProperty("id", Registry.ITEM.getId(i));
            item.addProperty("mojangName", names.get(i));
            item.addProperty("translationKey", i.getDescriptionId());
            item.addProperty("depletes", i.canBeDepleted());
            item.addProperty("maxStackSize", i.getMaxStackSize());
            item.addProperty("maxDamage", i.getMaxDamage());
            // item.addProperty("complex", i.isComplex()); basically useless
            item.addProperty("edible", i.isEdible());
            item.addProperty("fireResistant", i.isFireResistant());
            item.addProperty("blockId", Registry.BLOCK.getKey(Block.byItem(i)).toString());
            ResourceLocation eatingSound = Registry.SOUND_EVENT.getKey(i.getEatingSound());
            if (eatingSound != null) {
                item.addProperty("eatingSound", eatingSound.toString());
            }
            ResourceLocation drinkingSound = Registry.SOUND_EVENT.getKey(i.getDrinkingSound());
            if (drinkingSound != null) {
                item.addProperty("drinkingSound", drinkingSound.toString());
            }
            // Food Properties
            if (i.isEdible() && i.getFoodProperties() != null) {
                FoodProperties fp = i.getFoodProperties();

                JsonObject foodProperties = new JsonObject();
                foodProperties.addProperty("alwaysEdible", fp.canAlwaysEat());
                foodProperties.addProperty("isFastFood", fp.isFastFood());
                foodProperties.addProperty("nutrition", fp.getNutrition());
                foodProperties.addProperty("saturationModifier", fp.getSaturationModifier());

                {
                    // Food effects
                    JsonArray effects = new JsonArray();
                    for (Pair<MobEffectInstance, Float> effect : fp.getEffects()) {
                        ResourceLocation rl = Registry.MOB_EFFECT.getKey(effect.getFirst().getEffect());

                        if (rl == null) {
                            continue;
                        }
                        JsonObject foodEffect = new JsonObject();
                        foodEffect.addProperty("id", rl.toString());
                        foodEffect.addProperty("amplifier", effect.getFirst().getAmplifier());
                        foodEffect.addProperty("duration", effect.getFirst().getDuration());
                        foodEffect.addProperty("chance", effect.getSecond());
                        effects.add(foodEffect);
                    }
                    foodProperties.add("effects", effects);
                }
                item.add("foodProperties", foodProperties);
            }
            // Armor properties
            if (i instanceof ArmorItem ai) {

                JsonObject armorProperties = new JsonObject();
                armorProperties.addProperty("defense", ai.getDefense());
                armorProperties.addProperty("toughness", ai.getToughness());
                armorProperties.addProperty("slot", ai.getSlot().getName());

                item.add("armorProperties", armorProperties);
            }
            // SpawnEgg properties
            if (i instanceof SpawnEggItem sei) {

                JsonObject spawnEggProperties = new JsonObject();
                spawnEggProperties.addProperty("entityType", Registry.ENTITY_TYPE.getKey(sei.getType(null)).toString());

                item.add("spawnEggProperties", spawnEggProperties);
            }

            items.add(itemRL.toString(), item);
        }
        return items;
    }
}
