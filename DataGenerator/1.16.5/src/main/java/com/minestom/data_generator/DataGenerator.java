package com.minestom.data_generator;

import com.minestom.data_generator.GeneratedBiome.GeneratedBiomeEffects;
import com.minestom.data_generator.GeneratedBlock.GeneratedBlockState;
import com.minestom.data_generator.GeneratedBlock.GeneratedBlockState.GeneratedBlockStateMaterial;
import com.minestom.data_generator.GeneratedBlockEntity.GeneratedBlockEntityBlock;
import com.minestom.data_generator.GeneratedItem.GeneratedItemFoodProperties;
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
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.EmptyBlockGetter;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeSpecialEffects.GrassColorModifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.material.MaterialColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static com.minestom.data_generator.GeneratedItem.GeneratedItemFoodProperties.GeneratedFoodEffect;

public final class DataGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataGenerator.class);
    private static final Map<SoundEvent, String> soundNames = new HashMap<>();
    private static final Map<ParticleType<?>, String> particleNames = new HashMap<>();
    private static JsonGenerator jsonGenerator;

    public static void main(String[] args) {
        if (args.length == 0) {
            LOGGER.info("You must specify a version to generate data for.");
            return;
        }
        // version for the output.
        String version = args[0];

        // Should we generate extra Data
        boolean extraData = false;
        if (args.length >= 2 && args[1].equals("extra_data")) {
            extraData = true;
        }

        jsonGenerator = new JsonGenerator(version, extraData);

        generateBlocks();
        generateEntities();
        generateBlockEntities();
        generatePotionEffects();
        generateAttributes();
        generateEnchantments();
        generateMapColors();
        generateBiomes();
        generateDimensionTypes();
        // Extra mapping for "higher dependencies"
        // Sounds
        for (Field declaredField : SoundEvents.class.getDeclaredFields()) {
            if (!SoundEvent.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                SoundEvent se = (SoundEvent) declaredField.get(null);
                soundNames.put(se, declaredField.getName());
            } catch (IllegalAccessException e) {
                // Just stop I guess
                LOGGER.error("Failed to access map sound naming system", e);
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
                // Just stop I guess
                LOGGER.error("Failed to access map particle naming system", e);
                return;
            }
        }

        // Higher dependencies
        generateSounds();
        generateParticles();
        generateItems();
        generateVillagerProfessions();
        LOGGER.info("Output data in: ./DataGenerator/output/");
    }


    public static void generateBlocks() {
        Set<ResourceLocation> blockRLs = Registry.BLOCK.keySet();
        List<GeneratedBlock> generatedBlocks = new ArrayList<>();
        for (ResourceLocation blockRL : blockRLs) {
            Block b = Registry.BLOCK.get(blockRL);
            List<GeneratedBlockState> blockStates = new ArrayList<>();

            for (BlockState possibleState : b.getStateDefinition().getPossibleStates()) {
                GeneratedBlockStateMaterial generatedBlockStateMaterial = new GeneratedBlockStateMaterial(
                        possibleState.getMaterial().getPushReaction().toString(),
                        possibleState.getMaterial().blocksMotion(),
                        possibleState.getMaterial().isFlammable(),
                        possibleState.getMaterial().isLiquid(),
                        possibleState.getMaterial().isReplaceable(),
                        possibleState.getMaterial().isSolid(),
                        possibleState.getMaterial().isSolidBlocking(),
                        possibleState.getMaterial().getColor().id,
                        possibleState.getCollisionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString()
                );
                GeneratedBlockState generatedBlockState = new GeneratedBlockState(
                        Block.BLOCK_STATE_REGISTRY.getId(possibleState),
                        possibleState.getDestroySpeed(EmptyBlockGetter.INSTANCE, BlockPos.ZERO),
                        possibleState.getLightEmission(),
                        possibleState.canOcclude(),
                        generatedBlockStateMaterial
                );

                blockStates.add(generatedBlockState);
            }

            GeneratedBlock gb = new GeneratedBlock(
                    blockRL.toString(),
                    b.getDescriptionId(),
                    b.getExplosionResistance(),
                    b.getFriction(),
                    b.getSpeedFactor(),
                    b.getJumpFactor(),
                    Registry.ITEM.getKey(Item.BY_BLOCK.getOrDefault(b, Items.AIR)).toString(),
                    blockStates
            );
            generatedBlocks.add(gb);
        }
        jsonGenerator.output(generatedBlocks, "blocks");
    }

    private static void generateEntities() {
        Set<ResourceLocation> entityRLs = Registry.ENTITY_TYPE.keySet();
        List<GeneratedEntity> generatedEntities = new ArrayList<>();
        for (ResourceLocation entityRL : entityRLs) {
            EntityType<?> e = Registry.ENTITY_TYPE.get(entityRL);
            GeneratedEntity generatedEntity = new GeneratedEntity(
                    entityRL.toString(),
                    e.getDescriptionId(),
                    e.getCategory().toString(),
                    e.fireImmune(),
                    e.getHeight(),
                    e.getWidth(),
                    e.getDimensions().fixed
            );

            generatedEntities.add(generatedEntity);
        }
        jsonGenerator.output(generatedEntities, "entities");
    }

    @SuppressWarnings("unchecked")
    private static void generateBlockEntities() {
        Set<ResourceLocation> blockEntityRLs = Registry.BLOCK_ENTITY_TYPE.keySet();
        List<GeneratedBlockEntity> generatedBlockEntities = new ArrayList<>();
        for (ResourceLocation blockEntityRL : blockEntityRLs) {
            BlockEntityType<?> be = Registry.BLOCK_ENTITY_TYPE.get(blockEntityRL);
            // Use reflection to get valid blocks
            List<GeneratedBlockEntityBlock> generatedBlockEntityBlocks = new ArrayList<>();
            try {
                Field fcField = BlockEntityType.class.getDeclaredField("validBlocks");

                fcField.setAccessible(true);

                Set<Block> validBlocks = (Set<Block>) fcField.get(be);
                for (Block validBlock : validBlocks) {
                    GeneratedBlockEntityBlock generatedBlockEntityBlock = new GeneratedBlockEntityBlock(
                            Registry.BLOCK.getKey(validBlock).toString()
                    );
                    generatedBlockEntityBlocks.add(generatedBlockEntityBlock);
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                LOGGER.error("Failed to get block-entity blocks, skipping block-entity with ID '" + blockEntityRL.toString() + "'.", e);
                continue;
            }

            GeneratedBlockEntity generatedBlockEntity = new GeneratedBlockEntity(
                    blockEntityRL.toString(),
                    generatedBlockEntityBlocks
            );
            generatedBlockEntities.add(generatedBlockEntity);
        }
        jsonGenerator.output(generatedBlockEntities, "block_entities");
    }

    private static void generateItems() {
        Set<ResourceLocation> itemRLs = Registry.ITEM.keySet();
        List<GeneratedItem> generatedItems = new ArrayList<>();
        for (ResourceLocation itemRL : itemRLs) {
            Item i = Registry.ITEM.get(itemRL);
            GeneratedItemFoodProperties generatedItemFoodProperties = null;
            if (i.isEdible() && i.getFoodProperties() != null) {
                FoodProperties foodProperties = i.getFoodProperties();
                List<GeneratedFoodEffect> generatedEffects = new ArrayList<>();
                for (Pair<MobEffectInstance, Float> effect : foodProperties.getEffects()) {
                    ResourceLocation rl = Registry.MOB_EFFECT.getKey(effect.getFirst().getEffect());
                    if (rl == null) {
                        continue;
                    }
                    GeneratedFoodEffect foodEffect = new GeneratedFoodEffect(
                            rl.toString(),
                            effect.getFirst().getAmplifier(),
                            effect.getFirst().getDuration(),
                            effect.getSecond()
                    );
                    generatedEffects.add(foodEffect);
                }

                generatedItemFoodProperties = new GeneratedItemFoodProperties(
                        foodProperties.canAlwaysEat(),
                        foodProperties.isFastFood(),
                        foodProperties.getNutrition(),
                        foodProperties.getSaturationModifier(),
                        generatedEffects
                );
            }

            GeneratedItem generatedItem = new GeneratedItem(
                    itemRL.toString(),
                    i.getDescriptionId(),
                    i.getItemCategory() == null ? "none" : i.getItemCategory().getRecipeFolderName(),
                    i.canBeDepleted(),
                    i.getMaxStackSize(),
                    i.getMaxDamage(),
                    i.isComplex(),
                    i.isEdible(),
                    i.isFireResistant(),
                    soundNames.get(i.getEatingSound()),
                    soundNames.get(i.getDrinkingSound()),
                    generatedItemFoodProperties
            );
            generatedItems.add(generatedItem);
        }
        jsonGenerator.output(generatedItems, "items");
    }

    private static void generatePotionEffects() {
        Set<ResourceLocation> effectRLs = Registry.MOB_EFFECT.keySet();
        List<GeneratedEffect> generatedEffects = new ArrayList<>();
        for (ResourceLocation effectRL : effectRLs) {
            MobEffect me = Registry.MOB_EFFECT.get(effectRL);
            // Null safety check.
            if (me == null) {
                continue;
            }
            GeneratedEffect generatedEffect = new GeneratedEffect(
                    effectRL.toString(),
                    me.getDescriptionId(),
                    me.getColor(),
                    me.isInstantenous()
            );
            generatedEffects.add(generatedEffect);
        }
        jsonGenerator.output(generatedEffects, "potion_effects");
    }

    private static void generateAttributes() {
        Set<ResourceLocation> attributeRLs = Registry.ATTRIBUTE.keySet();
        List<GeneratedAttribute> generatedAttributes = new ArrayList<>();
        for (ResourceLocation attributeRL : attributeRLs) {
            Attribute attribute = Registry.ATTRIBUTE.get(attributeRL);
            if (attribute == null) {
                continue;
            }
            GeneratedAttribute generatedAttribute = new GeneratedAttribute(
                    attributeRL.toString(),
                    attribute.getDescriptionId(),
                    attribute.getDefaultValue()
            );
            generatedAttributes.add(generatedAttribute);
        }
        jsonGenerator.output(generatedAttributes, "attributes");
    }

    private static void generateEnchantments() {
        Set<ResourceLocation> enchantmentRLs = Registry.ENCHANTMENT.keySet();
        List<GeneratedEnchantment> generatedEnchantments = new ArrayList<>();
        for (ResourceLocation enchantmentRL : enchantmentRLs) {
            Enchantment enchantment = Registry.ENCHANTMENT.get(enchantmentRL);
            if (enchantment == null) {
                continue;
            }
            GeneratedEnchantment generatedEnchantment = new GeneratedEnchantment(
                    enchantmentRL.toString(),
                    enchantment.getDescriptionId(),
                    enchantment.getMaxLevel(),
                    enchantment.getMinLevel(),
                    enchantment.getRarity().toString(),
                    enchantment.isCurse(),
                    enchantment.isDiscoverable(),
                    enchantment.isTradeable(),
                    enchantment.isTreasureOnly(),
                    enchantment.category.name()
            );
            generatedEnchantments.add(generatedEnchantment);
        }
        jsonGenerator.output(generatedEnchantments, "enchantments");
    }

    private static void generateParticles() {
        Set<ResourceLocation> particleRLs = Registry.PARTICLE_TYPE.keySet();
        List<GeneratedParticle> generatedParticles = new ArrayList<>();
        for (ResourceLocation particleRL : particleRLs) {
            ParticleType<?> pt = Registry.PARTICLE_TYPE.get(particleRL);
            if (pt == null) {
                continue;
            }
            String name = particleNames.get(pt);
            // Get the colour's name using reflection
            if (name == null) {
                LOGGER.error("Failed to get name for a particle with id '" + particleRL.toString() + "', it will be skipped!");
                continue;
            }
            GeneratedParticle generatedParticle = new GeneratedParticle(
                    particleRL.toString(),
                    name
            );
            generatedParticles.add(generatedParticle);
        }
        jsonGenerator.output(generatedParticles, "particles");
    }

    private static void generateSounds() {
        Set<ResourceLocation> soundRLs = Registry.SOUND_EVENT.keySet();
        List<GeneratedSound> generatedSounds = new ArrayList<>();
        for (ResourceLocation soundRL : soundRLs) {
            SoundEvent se = Registry.SOUND_EVENT.get(soundRL);
            if (se == null) {
                continue;
            }
            String name = soundNames.get(se);
            // Get the colour's name using reflection
            if (name == null) {
                LOGGER.error("Failed to get name for a sound with id '" + soundRL.toString() + "', it will be skipped!");
                continue;
            }
            GeneratedSound generatedSound = new GeneratedSound(
                    soundRL.toString(),
                    name
            );
            generatedSounds.add(generatedSound);
        }
        jsonGenerator.output(generatedSounds, "sounds");
    }

    @SuppressWarnings("unchecked")
    private static void generateBiomes() {
        Set<ResourceLocation> biomeRLs = BuiltinRegistries.BIOME.keySet();
        List<GeneratedBiome> generatedBiomes = new ArrayList<>();
        for (ResourceLocation biomeRL : biomeRLs) {
            Biome biome = BuiltinRegistries.BIOME.get(biomeRL);
            if (biome == null) {
                continue;
            }
            GeneratedBiomeEffects generatedBiomeEffects;
            // Use reflection to access SpecialBiomeEffects (why the hell is this private anyway?!?)
            try {
                BiomeSpecialEffects bse = biome.getSpecialEffects();
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


                generatedBiomeEffects = new GeneratedBiomeEffects(
                        fogColor,
                        waterColor,
                        waterFogColor,
                        skyColor,
                        foliageColorOverride.orElse(null),
                        grassColorOverride.orElse(null),
                        grassColorModifier.name()
                );

            } catch (IllegalAccessException | NoSuchFieldException e) {
                LOGGER.error("Failed to get biome effects, skipping biome with ID '" + biomeRL.toString() + "'.", e);
                continue;
            }
            GeneratedBiome generatedBiome = new GeneratedBiome(
                    biomeRL.toString(),
                    biome.isHumid(),
                    biome.getScale(),
                    biome.getDepth(),
                    biome.getBaseTemperature(),
                    biome.getDownfall(),
                    biome.getPrecipitation().name(),
                    biome.getBiomeCategory().name(),
                    generatedBiomeEffects
            );
            generatedBiomes.add(generatedBiome);
        }
        jsonGenerator.output(generatedBiomes, "biomes");
    }

    private static void generateVillagerProfessions() {
        Set<ResourceLocation> villagerProfessionRLs = Registry.VILLAGER_PROFESSION.keySet();
        List<GeneratedVillagerProfession> generatedVillagerProfessions = new ArrayList<>();
        for (ResourceLocation villagerProfessionRL : villagerProfessionRLs) {
            VillagerProfession vp = Registry.VILLAGER_PROFESSION.get(villagerProfessionRL);

            GeneratedVillagerProfession generatedBlockEntity = new GeneratedVillagerProfession(
                    villagerProfessionRL.toString(),
                    soundNames.get(vp.getWorkSound())
            );
            generatedVillagerProfessions.add(generatedBlockEntity);
        }
        jsonGenerator.output(generatedVillagerProfessions, "villager_professions");
    }

    private static void generateDimensionTypes() {
        Set<ResourceLocation> dimensionTypeRLs = RegistryAccess.RegistryHolder.builtin().dimensionTypes().keySet();
        List<GeneratedDimensionType> generatedDimensionTypes = new ArrayList<>();
        for (ResourceLocation dimensionTypeRL : dimensionTypeRLs) {
            DimensionType dimensionType = RegistryAccess.RegistryHolder.builtin().dimensionTypes().get(dimensionTypeRL);
            // null check
            if (dimensionType == null) {
                continue;
            }

            GeneratedDimensionType generatedDimensionType = new GeneratedDimensionType(
                    dimensionTypeRL.toString(),
                    dimensionType.bedWorks(),
                    dimensionType.coordinateScale(),
                    dimensionType.hasCeiling(),
                    dimensionType.hasFixedTime(),
                    dimensionType.hasRaids(),
                    dimensionType.hasSkyLight(),
                    dimensionType.piglinSafe(),
                    dimensionType.logicalHeight(),
                    dimensionType.natural(),
                    dimensionType.ultraWarm(),
                    dimensionType.respawnAnchorWorks()
            );
            generatedDimensionTypes.add(generatedDimensionType);
        }
        jsonGenerator.output(generatedDimensionTypes, "dimension_types");
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

        List<GeneratedMapColor> generatedMapColors = new ArrayList<>();
        for (MaterialColor materialColor : MaterialColor.MATERIAL_COLORS) {
            if (materialColor == null) {
                continue;
            }
            String name = names.get(materialColor);
            // Get the colour's name using reflection
            if (name == null) {
                LOGGER.error("Failed to get name for a color with id, it will be skipped!");
                continue;
            }
            GeneratedMapColor generatedMapColor = new GeneratedMapColor(
                    name,
                    materialColor.id,
                    materialColor.col
            );
            generatedMapColors.add(generatedMapColor);
        }
        jsonGenerator.output(generatedMapColors, "map_colors");
    }
}
