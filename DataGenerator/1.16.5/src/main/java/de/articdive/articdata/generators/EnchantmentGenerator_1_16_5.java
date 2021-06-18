package de.articdive.articdata.generators;

import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Set;

public final class EnchantmentGenerator_1_16_5 extends DataGenerator_1_16_5<Enchantment> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnchantmentGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : Enchantments.class.getDeclaredFields()) {
            if (!Enchantment.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                Enchantment e = (Enchantment) declaredField.get(null);
                names.put(e, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map enchantment naming system", e);
                return;
            }
        }
    }

    @Override
    public JsonObject generate() {
        Set<ResourceLocation> enchantmentRLs = Registry.ENCHANTMENT.keySet();
        JsonObject enchantments = new JsonObject();

        for (ResourceLocation enchantmentRL : enchantmentRLs) {
            Enchantment e = Registry.ENCHANTMENT.get(enchantmentRL);
            if (e == null) {
                continue;
            }
            JsonObject enchantment = new JsonObject();

            enchantment.addProperty("id", Registry.ENCHANTMENT.getId(e));
            enchantment.addProperty("mojangName", names.get(e));
            enchantment.addProperty("translationKey", e.getDescriptionId());
            enchantment.addProperty("maxLevel", e.getMaxLevel());
            enchantment.addProperty("minLevel", e.getMinLevel());
            enchantment.addProperty("rarity", e.getRarity().toString());
            enchantment.addProperty("curse", e.isCurse());
            enchantment.addProperty("discoverable", e.isDiscoverable());
            enchantment.addProperty("tradeable", e.isTradeable());
            enchantment.addProperty("treasureOnly", e.isTreasureOnly());
            enchantment.addProperty("category", e.category.name());

            enchantments.add(enchantmentRL.toString(), enchantment);
        }
        return enchantments;
    }
}
