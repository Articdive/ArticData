package com.minestom.data_generator;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.EmptyBlockGetter;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeSpecialEffects.GrassColorModifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.material.MaterialColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public final class DataGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataGenerator.class);
    private static final Map<Block, String> blockNames = new HashMap<>();
    private static final Map<EntityType<?>, String> entityNames = new HashMap<>();
    private static final Map<BlockEntityType<?>, String> blockEntityNames = new HashMap<>();
    private static final Map<Item, String> itemNames = new HashMap<>();
    private static final Map<MobEffect, String> effectNames = new HashMap<>();
    private static final Map<Attribute, String> attributeNames = new HashMap<>();
    private static final Map<Enchantment, String> enchantmentNames = new HashMap<>();
    private static final Map<ParticleType<?>, String> particleNames = new HashMap<>();
    private static final Map<SoundEvent, String> soundNames = new HashMap<>();
    private static final Map<VillagerProfession, String> villagerProfessionNames = new HashMap<>();
    private static JsonGenerator jsonGenerator;

    public static void main(String[] args) {
        if (args.length == 0) {
            LOGGER.info("You must specify a version to generate data for.");
            return;
        }
        // version for the output.
        String version = args[0];

        jsonGenerator = new JsonGenerator(version);
        // static init
        Registry.BLOCK.getDefaultKey();

        // Extra mapping for names
        {
            // Blocks
            for (Field declaredField : Blocks.class.getDeclaredFields()) {
                if (!Block.class.isAssignableFrom(declaredField.getType())) {
                    continue;
                }
                try {
                    Block b = (Block) declaredField.get(null);
                    blockNames.put(b, declaredField.getName());
                } catch (IllegalAccessException e) {
                    LOGGER.error("Failed to map block naming system", e);
                    return;
                }
            }
            // Entities
            for (Field declaredField : EntityType.class.getDeclaredFields()) {
                if (!EntityType.class.isAssignableFrom(declaredField.getType())) {
                    continue;
                }
                try {
                    EntityType<?> et = (EntityType<?>) declaredField.get(null);
                    entityNames.put(et, declaredField.getName());
                } catch (IllegalAccessException e) {
                    LOGGER.error("Failed to map entity naming system", e);
                    return;
                }
            }
            // BlockEntities
            for (Field declaredField : BlockEntityType.class.getDeclaredFields()) {
                if (!BlockEntityType.class.isAssignableFrom(declaredField.getType())) {
                    continue;
                }
                try {
                    BlockEntityType<?> bet = (BlockEntityType<?>) declaredField.get(null);
                    blockEntityNames.put(bet, declaredField.getName());
                } catch (IllegalAccessException e) {
                    LOGGER.error("Failed to map block-entity naming system", e);
                    return;
                }
            }
            // Items
            for (Field declaredField : Items.class.getDeclaredFields()) {
                if (!Item.class.isAssignableFrom(declaredField.getType())) {
                    continue;
                }
                try {
                    Item i = (Item) declaredField.get(null);
                    itemNames.put(i, declaredField.getName());
                } catch (IllegalAccessException e) {
                    LOGGER.error("Failed to map item naming system", e);
                    return;
                }
            }
            // Effects
            for (Field declaredField : MobEffects.class.getDeclaredFields()) {
                if (!MobEffect.class.isAssignableFrom(declaredField.getType())) {
                    continue;
                }
                try {
                    MobEffect me = (MobEffect) declaredField.get(null);
                    effectNames.put(me, declaredField.getName());
                } catch (IllegalAccessException e) {
                    LOGGER.error("Failed to map effect naming system", e);
                    return;
                }
            }
            // Attributes
            for (Field declaredField : Attributes.class.getDeclaredFields()) {
                if (!Attribute.class.isAssignableFrom(declaredField.getType())) {
                    continue;
                }
                try {
                    Attribute a = (Attribute) declaredField.get(null);
                    attributeNames.put(a, declaredField.getName());
                } catch (IllegalAccessException e) {
                    LOGGER.error("Failed to map effect naming system", e);
                    return;
                }
            }
            // Enchantments
            for (Field declaredField : Enchantments.class.getDeclaredFields()) {
                if (!Enchantment.class.isAssignableFrom(declaredField.getType())) {
                    continue;
                }
                try {
                    Enchantment e = (Enchantment) declaredField.get(null);
                    enchantmentNames.put(e, declaredField.getName());
                } catch (IllegalAccessException e) {
                    LOGGER.error("Failed to map effect naming system", e);
                    return;
                }
            }
            // Particles
            for (Field declaredField : ParticleTypes.class.getDeclaredFields()) {
                if (!ParticleType.class.isAssignableFrom(declaredField.getType())) {
                    continue;
                }
                try {
                    ParticleType<?> pt = (ParticleType<?>) declaredField.get(null);
                    particleNames.put(pt, declaredField.getName());
                } catch (IllegalAccessException e) {
                    LOGGER.error("Failed to map particle naming system", e);
                    return;
                }
            }
            // Sounds
            for (Field declaredField : SoundEvents.class.getDeclaredFields()) {
                if (!SoundEvent.class.isAssignableFrom(declaredField.getType())) {
                    continue;
                }
                try {
                    SoundEvent se = (SoundEvent) declaredField.get(null);
                    soundNames.put(se, declaredField.getName());
                } catch (IllegalAccessException e) {
                    LOGGER.error("Failed to map sound naming system", e);
                    return;
                }
            }
            // Villager Professions
            for (Field declaredField : VillagerProfession.class.getDeclaredFields()) {
                if (!VillagerProfession.class.isAssignableFrom(declaredField.getType())) {
                    continue;
                }
                try {
                    VillagerProfession vp = (VillagerProfession) declaredField.get(null);
                    villagerProfessionNames.put(vp, declaredField.getName());
                } catch (IllegalAccessException e) {
                    LOGGER.error("Failed to map villager profession naming system", e);
                    return;
                }
            }
        }

        generateBlocks();
        generateEntities();
        generateBlockEntities();
        generateItems();
        generateEffects();
        generateAttributes();
        generateEnchantments();
        generateParticles();
        generateSounds();
        generateBiomes();
        generateVillagerProfessions();
        generateDimensionTypes();
        generateMapColors();


        LOGGER.info("Output data in: ./DataGenerator/output/");
    }


    public static void generateBlocks() {
        Set<ResourceLocation> blockRLs = Registry.BLOCK.keySet();
        JsonArray blocks = new JsonArray();
        for (ResourceLocation blockRL : blockRLs) {
            Block b = Registry.BLOCK.get(blockRL);

            JsonObject block = new JsonObject();
            block.addProperty("id", blockRL.toString());
            block.addProperty("name", blockNames.get(b));
            block.addProperty("langId", b.getDescriptionId());
            block.addProperty("explosionResistance", b.getExplosionResistance());
            block.addProperty("friction", b.getFriction());
            block.addProperty("speedFactor", b.getSpeedFactor());
            block.addProperty("jumpFactor", b.getJumpFactor());
            block.addProperty("defaultBlockState", Block.BLOCK_STATE_REGISTRY.getId(b.defaultBlockState()));
            block.addProperty("itemId", Registry.ITEM.getKey(Item.BY_BLOCK.getOrDefault(b, Items.AIR)).toString());

            {
                // Block states
                JsonArray blockStates = new JsonArray();
                for (BlockState bs : b.getStateDefinition().getPossibleStates()) {
                    JsonObject state = new JsonObject();
                    state.addProperty("id", Block.BLOCK_STATE_REGISTRY.getId(bs));
                    state.addProperty("destroySpeed", bs.getDestroySpeed(EmptyBlockGetter.INSTANCE, BlockPos.ZERO));
                    state.addProperty("lightEmission", bs.getLightEmission());
                    state.addProperty("doesOcclude", bs.canOcclude());

                    {
                        // Material
                        JsonObject material = new JsonObject();
                        material.addProperty("push_reaction", bs.getMaterial().getPushReaction().toString());
                        material.addProperty("blocksMotion", bs.getMaterial().blocksMotion());
                        material.addProperty("isFlammable", bs.getMaterial().isFlammable());
                        material.addProperty("isLiquid", bs.getMaterial().isLiquid());
                        material.addProperty("isReplaceable", bs.getMaterial().isReplaceable());
                        material.addProperty("isSolid", bs.getMaterial().isSolid());
                        material.addProperty("isSolidBlocking", bs.getMaterial().isSolidBlocking());
                        material.addProperty("mapColorId", bs.getMaterial().getColor().id);
                        material.addProperty("bounding_box", bs.getCollisionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());
                        state.add("material", material);
                    }
                    blockStates.add(state);
                }
                block.add("states", blockStates);
            }

            blocks.add(block);
        }
        jsonGenerator.output(blocks, "blocks");
    }

    private static void generateEntities() {
        Set<ResourceLocation> entityRLs = Registry.ENTITY_TYPE.keySet();
        JsonArray entities = new JsonArray();

        for (ResourceLocation entityRL : entityRLs) {
            EntityType<?> et = Registry.ENTITY_TYPE.get(entityRL);

            JsonObject entity = new JsonObject();
            entity.addProperty("id", entityRL.toString());
            entity.addProperty("name", entityNames.get(et));
            entity.addProperty("langId", et.getDescriptionId());
            entity.addProperty("category", et.getCategory().toString());
            entity.addProperty("fireImmune", et.fireImmune());
            entity.addProperty("height", et.getHeight());
            entity.addProperty("width", et.getWidth());
            entity.addProperty("fixed", et.getDimensions().fixed);

            entities.add(entity);
        }
        jsonGenerator.output(entities, "entities");
    }

    @SuppressWarnings("unchecked")
    private static void generateBlockEntities() {
        Set<ResourceLocation> blockEntityRLs = Registry.BLOCK_ENTITY_TYPE.keySet();
        JsonArray blockEntities = new JsonArray();

        for (ResourceLocation blockEntityRL : blockEntityRLs) {
            BlockEntityType<?> bet = Registry.BLOCK_ENTITY_TYPE.get(blockEntityRL);

            JsonObject blockEntity = new JsonObject();
            blockEntity.addProperty("id", blockEntityRL.toString());
            blockEntity.addProperty("name", blockEntityNames.get(bet));

            // Use reflection to get valid blocks
            {
                JsonArray beBlocks = new JsonArray();
                try {
                    Field fcField = BlockEntityType.class.getDeclaredField("validBlocks");

                    fcField.setAccessible(true);

                    Set<Block> validBlocks = (Set<Block>) fcField.get(bet);
                    for (Block validBlock : validBlocks) {
                        JsonObject beBlock = new JsonObject();
                        beBlock.addProperty("id", Registry.BLOCK.getKey(validBlock).toString());

                        beBlocks.add(beBlock);
                    }
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    LOGGER.error("Failed to get block-entity blocks, skipping block-entity with ID '" + blockEntityRL.toString() + "'.", e);
                    continue;
                }
                blockEntity.add("blocks", beBlocks);
            }
            blockEntities.add(blockEntity);
        }
        jsonGenerator.output(blockEntities, "block_entities");
    }

    private static void generateItems() {
        Set<ResourceLocation> itemRLs = Registry.ITEM.keySet();
        JsonArray items = new JsonArray();

        for (ResourceLocation itemRL : itemRLs) {
            Item i = Registry.ITEM.get(itemRL);

            JsonObject item = new JsonObject();
            item.addProperty("id", itemRL.toString());
            item.addProperty("name", itemNames.get(i));
            item.addProperty("langId", i.getDescriptionId());
            item.addProperty("depletes", i.canBeDepleted());
            item.addProperty("maxStackSize", i.getMaxStackSize());
            item.addProperty("maxDamage", i.getMaxDamage());
            // item.addProperty("complex", i.isComplex()); basically useless
            item.addProperty("edible", i.isEdible());
            item.addProperty("fireResistant", i.isFireResistant());
            item.addProperty("eatingSound", soundNames.get(i.getEatingSound()));
            item.addProperty("drinkingSound", soundNames.get(i.getDrinkingSound()));

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
            items.add(item);
        }
        jsonGenerator.output(items, "items");
    }

    private static void generateEffects() {
        Set<ResourceLocation> effectRLs = Registry.MOB_EFFECT.keySet();
        JsonArray effects = new JsonArray();

        for (ResourceLocation effectRL : effectRLs) {
            MobEffect me = Registry.MOB_EFFECT.get(effectRL);

            JsonObject effect = new JsonObject();
            // Null safety check.
            if (me == null) {
                continue;
            }
            effect.addProperty("id", effectRL.toString());
            effect.addProperty("name", effectNames.get(me));
            effect.addProperty("langId", me.getDescriptionId());
            effect.addProperty("color", me.getColor());
            effect.addProperty("instantenous", me.isInstantenous());

            effects.add(effect);
        }
        jsonGenerator.output(effects, "potion_effects");
    }

    private static void generateAttributes() {
        Set<ResourceLocation> attributeRLs = Registry.ATTRIBUTE.keySet();
        JsonArray attributes = new JsonArray();

        for (ResourceLocation attributeRL : attributeRLs) {
            Attribute a = Registry.ATTRIBUTE.get(attributeRL);

            JsonObject attribute = new JsonObject();
            if (a == null) {
                continue;
            }
            attribute.addProperty("id", attributeRL.toString());
            attribute.addProperty("name", attributeNames.get(a));
            attribute.addProperty("langId", a.getDescriptionId());
            attribute.addProperty("defaultValue", a.getDefaultValue());

            attributes.add(attribute);
        }
        jsonGenerator.output(attributes, "attributes");
    }

    private static void generateEnchantments() {
        Set<ResourceLocation> enchantmentRLs = Registry.ENCHANTMENT.keySet();
        JsonArray enchantments = new JsonArray();

        for (ResourceLocation enchantmentRL : enchantmentRLs) {
            Enchantment e = Registry.ENCHANTMENT.get(enchantmentRL);
            if (e == null) {
                continue;
            }
            JsonObject enchantment = new JsonObject();

            enchantment.addProperty("id", enchantmentRL.toString());
            enchantment.addProperty("name", enchantmentNames.get(e));
            enchantment.addProperty("langId", e.getDescriptionId());
            enchantment.addProperty("maxLevel", e.getMaxLevel());
            enchantment.addProperty("minLevel", e.getMinLevel());
            enchantment.addProperty("rarity", e.getRarity().toString());
            enchantment.addProperty("curse", e.isCurse());
            enchantment.addProperty("discoverable", e.isDiscoverable());
            enchantment.addProperty("tradeable", e.isTradeable());
            enchantment.addProperty("treasureOnly", e.isTreasureOnly());
            enchantment.addProperty("category", e.category.name());
            enchantments.add(enchantment);
        }
        jsonGenerator.output(enchantments, "enchantments");
    }

    private static void generateParticles() {
        Set<ResourceLocation> particleRLs = Registry.PARTICLE_TYPE.keySet();
        JsonArray particles = new JsonArray();

        for (ResourceLocation particleRL : particleRLs) {
            ParticleType<?> pt = Registry.PARTICLE_TYPE.get(particleRL);
            if (pt == null) {
                continue;
            }
            JsonObject particle = new JsonObject();

            particle.addProperty("id", particleRL.toString());
            particle.addProperty("name", particleNames.get(pt));
            particles.add(particle);
        }
        jsonGenerator.output(particles, "particles");
    }

    private static void generateSounds() {
        Set<ResourceLocation> soundRLs = Registry.SOUND_EVENT.keySet();
        JsonArray sounds = new JsonArray();

        for (ResourceLocation soundRL : soundRLs) {
            SoundEvent se = Registry.SOUND_EVENT.get(soundRL);
            if (se == null) {
                continue;
            }
            JsonObject sound = new JsonObject();

            sound.addProperty("id", soundRL.toString());
            sound.addProperty("name", soundNames.get(se));
            sounds.add(sound);
        }
        jsonGenerator.output(sounds, "sounds");
    }

    @SuppressWarnings("unchecked")
    private static void generateBiomes() {
        Set<ResourceLocation> biomeRLs = BuiltinRegistries.BIOME.keySet();
        JsonArray biomes = new JsonArray();

        for (ResourceLocation biomeRL : biomeRLs) {
            Biome b = BuiltinRegistries.BIOME.get(biomeRL);
            if (b == null) {
                continue;
            }
            JsonObject biome = new JsonObject();

            biome.addProperty("id", biomeRL.toString());
            biome.addProperty("humid", b.isHumid());
            biome.addProperty("scale", b.getScale());
            biome.addProperty("depth", b.getDepth());
            biome.addProperty("temperature", b.getBaseTemperature());
            biome.addProperty("downfall", b.getDownfall());
            biome.addProperty("precipitation", b.getPrecipitation().name());
            biome.addProperty("category", b.getBiomeCategory().name());

            {
                // Use reflection to access SpecialBiomeEffects (why the hell is this private anyway?)
                JsonObject biomeEffects = new JsonObject();
                try {
                    BiomeSpecialEffects bse = b.getSpecialEffects();
                    Field fcField = BiomeSpecialEffects.class.getDeclaredField("fogColor");
                    Field wcField = BiomeSpecialEffects.class.getDeclaredField("waterColor");
                    Field wfcField = BiomeSpecialEffects.class.getDeclaredField("waterFogColor");
                    Field scField = BiomeSpecialEffects.class.getDeclaredField("skyColor");
                    Field fcoField = BiomeSpecialEffects.class.getDeclaredField("foliageColorOverride");
                    Field gcoField = BiomeSpecialEffects.class.getDeclaredField("grassColorOverride");
                    Field gcmField = BiomeSpecialEffects.class.getDeclaredField("grassColorModifier");

                    fcField.setAccessible(true);
                    wcField.setAccessible(true);
                    wfcField.setAccessible(true);
                    scField.setAccessible(true);
                    fcoField.setAccessible(true);
                    gcoField.setAccessible(true);
                    gcmField.setAccessible(true);

                    int fogColor = fcField.getInt(bse);
                    int waterColor = wcField.getInt(bse);
                    int waterFogColor = wfcField.getInt(bse);
                    int skyColor = scField.getInt(bse);
                    Optional<Integer> foliageColorOverride = (Optional<Integer>) fcoField.get(bse);
                    Optional<Integer> grassColorOverride = (Optional<Integer>) gcoField.get(bse);
                    GrassColorModifier grassColorModifier = (GrassColorModifier) gcmField.get(bse);

                    biomeEffects.addProperty("fogColor", fogColor);
                    biomeEffects.addProperty("waterColor", waterColor);
                    biomeEffects.addProperty("waterFogColor", waterFogColor);
                    biomeEffects.addProperty("skyColor", skyColor);
                    biomeEffects.addProperty("foliageColorOverride", foliageColorOverride.orElse(null));
                    biomeEffects.addProperty("grassColorOverride", grassColorOverride.orElse(null));
                    biomeEffects.addProperty("grassColorModifier", grassColorModifier.name());
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    LOGGER.error("Failed to get biome effects, skipping biome with ID '" + biomeRL.toString() + "'.", e);
                    continue;
                }
                biome.add("effects", biomeEffects);
            }
            biomes.add(biome);
        }
        jsonGenerator.output(biomes, "biomes");
    }

    private static void generateVillagerProfessions() {
        Set<ResourceLocation> villagerProfessionRLs = Registry.VILLAGER_PROFESSION.keySet();
        JsonArray villagerProfessions = new JsonArray();

        for (ResourceLocation villagerProfessionRL : villagerProfessionRLs) {
            VillagerProfession vp = Registry.VILLAGER_PROFESSION.get(villagerProfessionRL);

            JsonObject villagerProfession = new JsonObject();
            villagerProfession.addProperty("id", villagerProfessionRL.toString());
            villagerProfession.addProperty("name", villagerProfessionNames.get(vp));
            villagerProfession.addProperty("workSound", soundNames.get(vp.getWorkSound()));

            villagerProfessions.add(villagerProfession);
        }
        jsonGenerator.output(villagerProfessions, "villager_professions");
    }

    private static void generateDimensionTypes() {
        Registry<DimensionType> dimensionTypeRegistry = RegistryAccess.RegistryHolder.builtin().ownedRegistry(Registry.DIMENSION_TYPE_REGISTRY).orElse(null);
        if (dimensionTypeRegistry == null) {
            LOGGER.error("Failed to hook into dimension type registry. Dimension types will be skipped!");
            return;
        }
        Set<ResourceLocation> dimensionTypeRLs = dimensionTypeRegistry.keySet();
        JsonArray dimensionTypes = new JsonArray();

        for (ResourceLocation dimensionTypeRL : dimensionTypeRLs) {
            DimensionType dt = dimensionTypeRegistry.get(dimensionTypeRL);
            if (dt == null) {
                continue;
            }
            JsonObject dimensionType = new JsonObject();

            dimensionType.addProperty("id", dimensionTypeRL.toString());
            dimensionType.addProperty("bedWorks", dt.bedWorks());
            dimensionType.addProperty("coordinateScale", dt.coordinateScale());
            dimensionType.addProperty("ceiling", dt.hasCeiling());
            dimensionType.addProperty("fixedTime", dt.hasFixedTime());
            dimensionType.addProperty("raids", dt.hasRaids());
            dimensionType.addProperty("skyLight", dt.hasSkyLight());
            dimensionType.addProperty("piglinSafe", dt.piglinSafe());
            dimensionType.addProperty("logicalHeight", dt.logicalHeight());
            dimensionType.addProperty("natural", dt.natural());
            dimensionType.addProperty("ultraWarm", dt.ultraWarm());
            dimensionType.addProperty("respawnAnchorWorks", dt.respawnAnchorWorks());
            dimensionType.addProperty("maxY", dt.height());
            dimensionType.addProperty("minY", dt.minY());
            dimensionTypes.add(dimensionType);
        }
        jsonGenerator.output(dimensionTypes, "dimension_types");
    }

    private static void generateMapColors() {
        HashMap<MaterialColor, String> names = new HashMap<>();
        // Map field name to material color.
        for (Field declaredField : MaterialColor.class.getDeclaredFields()) {
            if (declaredField.getName().equals("MATERIAL_COLORS") || declaredField.getType() != MaterialColor.class) {
                continue;
            }
            try {
                MaterialColor mc = (MaterialColor) declaredField.get(null);
                names.put(mc, declaredField.getName());
            } catch (IllegalAccessException e) {
                // Just stop I guess
                LOGGER.error("Failed to access map color naming system", e);
                return;
            }
        }

        JsonArray mapColors = new JsonArray();

        for (MaterialColor mc : MaterialColor.MATERIAL_COLORS) {
            if (mc == null) {
                continue;
            }
            JsonObject mapColor = new JsonObject();

            mapColor.addProperty("name", names.get(mc));
            mapColor.addProperty("id", mc.id);
            mapColor.addProperty("color", mc.col);
            mapColors.add(mapColor);
        }
        jsonGenerator.output(mapColors, "map_colors");
    }
}