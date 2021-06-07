package net.minestom.datagen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DataGen {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataGenHolder.class);

    private DataGen() {

    }

    public static void main(String[] args) {
        if (args.length == 0) {
            LOGGER.info("You must specify a version to generate data for.");
            return;
        }
        Version version = Version.parseVersion(args[0]);
        if (version == null) {
            LOGGER.error("The version specified is not explicitly defined.");
            LOGGER.error("The generator will fallback to 1.16.5 and attempt to use its generators.");
            version = Version.MC_1_16_5;
        }
        String versionPrefix = args[0].replace('.', '_') + "_";

        switch (version) {
            case MC_1_17 -> {
                // Run 1.17
                try {
                    Class<?> dgCommon1_17 = Class.forName("net.minestom.generators.common.DataGenerator_1_17");
                    Method prepareMethod1_17 = dgCommon1_17.getDeclaredMethod("prepare");
                    prepareMethod1_17.invoke(null);
                } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                }

                DataGenHolder.addGenerator(DataGenType.ATTRIBUTES, "AttributeGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.BIOMES, "BiomeGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.BLOCK_ENTITIES, "BlockEntityGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.BLOCK_PROPERTIES, "BlockPropertyGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.BLOCKS, "BlockGenerator_1_17");
                DataGenHolder.addGenerator(DataGenType.CUSTOM_STATISTICS, "CustomStatisticGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.DIMENSION_TYPES, "DimensionTypeGenerator_1_17");
                DataGenHolder.addGenerator(DataGenType.ENCHANTMENTS, "EnchantmentGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ENTITIES, "EntityGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ENTITY_DATA_SERIALIZERS, "EntityDataSerializerGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.FLUIDS, "FluidGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.MATERIALS, "MaterialGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.MAP_COLORS, "MapColorGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.PARTICLES, "ParticleGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.MOB_EFFECTS, "MobEffectGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.POTIONS, "PotionGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.SOUNDS, "SoundGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.VILLAGER_PROFESSIONS, "VillagerProfessionGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.VILLAGER_TYPES, "VillagerTypeGenerator_1_16_5");

                DataGenHolder.addGenerator(DataGenType.BLOCK_TAGS, "tags.BlockTagGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ENTITY_TYPE_TAGS, "tags.EntityTypeTagGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.FLUID_TAGS, "tags.FluidTagGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ITEM_TAGS, "tags.ItemTagGenerator_1_16_5");

                DataGenHolder.addGenerator(DataGenType.BLOCK_LOOT_TABLES, "loot_tables.BlockLootTableGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.CHEST_LOOT_TABLES, "loot_tables.ChestLootTableGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ENTITY_LOOT_TABLES, "loot_tables.EntityLootTableGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.GAMEPLAY_LOOT_TABLES, "loot_tables.GameplayLootTableGenerator_1_16_5");
            }
            case MC_1_16, MC_1_16_1, MC_1_16_2, MC_1_16_3, MC_1_16_4, MC_1_16_5 -> {
                // Run 1.16_5
                try {
                    Class<?> dgCommon1_16_5 = Class.forName("net.minestom.generators.common.DataGenerator_1_16_5");
                    Method prepareMethod1_16_5 = dgCommon1_16_5.getDeclaredMethod("prepare");
                    prepareMethod1_16_5.invoke(null);
                } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                }

                DataGenHolder.addGenerator(DataGenType.ATTRIBUTES, "AttributeGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.BIOMES, "BiomeGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.BLOCK_ENTITIES, "BlockEntityGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.BLOCK_PROPERTIES, "BlockPropertyGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.BLOCKS, "BlockGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.CUSTOM_STATISTICS, "CustomStatisticGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.DIMENSION_TYPES, "DimensionTypeGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ENCHANTMENTS, "EnchantmentGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ENTITIES, "EntityGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ENTITY_DATA_SERIALIZERS, "EntityDataSerializerGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.FLUIDS, "FluidGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.MATERIALS, "MaterialGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.MAP_COLORS, "MapColorGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.PARTICLES, "ParticleGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.MOB_EFFECTS, "MobEffectGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.POTIONS, "PotionGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.SOUNDS, "SoundGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.VILLAGER_PROFESSIONS, "VillagerProfessionGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.VILLAGER_TYPES, "VillagerTypeGenerator_1_16_5");

                DataGenHolder.addGenerator(DataGenType.BLOCK_TAGS, "tags.BlockTagGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ENTITY_TYPE_TAGS, "tags.EntityTypeTagGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.FLUID_TAGS, "tags.FluidTagGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ITEM_TAGS, "tags.ItemTagGenerator_1_16_5");

                DataGenHolder.addGenerator(DataGenType.BLOCK_LOOT_TABLES, "loot_tables.BlockLootTableGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.CHEST_LOOT_TABLES, "loot_tables.ChestLootTableGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.ENTITY_LOOT_TABLES, "loot_tables.EntityLootTableGenerator_1_16_5");
                DataGenHolder.addGenerator(DataGenType.GAMEPLAY_LOOT_TABLES, "loot_tables.GameplayLootTableGenerator_1_16_5");
            }
        }

        // Folder for the output.
        // Remove a character at the end since the prefix includes an _ at the end
        File outputFolder = new File("../Minestom-data/" + versionPrefix.substring(0, versionPrefix.length() - 1) + "/");
        if (args.length >= 2) {
            outputFolder = new File(args[1]);
        }
        DataGenHolder.runGenerators(new JsonOutputter(versionPrefix, outputFolder));

        LOGGER.info("Output data in: " + outputFolder.getAbsolutePath());
    }

    enum Version {
        MC_1_16,
        MC_1_16_1,
        MC_1_16_2,
        MC_1_16_3,
        MC_1_16_4,
        MC_1_16_5,
        MC_1_17;

        public static Version parseVersion(String versionInput) {
            switch (versionInput) {
                case "1.16": {
                    return MC_1_16;
                }
                case "1.16.1": {
                    return MC_1_16_1;
                }
                case "1.16.2": {
                    return MC_1_16_2;
                }
                case "1.16.3": {
                    return MC_1_16_3;
                }
                case "1.16.4": {
                    return MC_1_16_4;
                }
                case "1.16.5": {
                    return MC_1_16_5;
                }
                case "1.17-pre1":
                case "1.17-pre2":
                case "1.17-pre3":
                case "1.17-pre4":
                case "1.17-pre5":
                case "1.17-rc1":
                case "1.17-rc2": {
                    return MC_1_17;
                }
            }
            return null;
        }
    }
}
