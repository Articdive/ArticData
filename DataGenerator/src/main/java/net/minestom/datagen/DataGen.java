package net.minestom.datagen;

import net.minestom.generators.AttributeGenerator_1_16_5;
import net.minestom.generators.BiomeGenerator_1_16_5;
import net.minestom.generators.BlockEntityGenerator_1_16_5;
import net.minestom.generators.BlockGenerator_1_16_5;
import net.minestom.generators.BlockPropertyGenerator_1_16_5;
import net.minestom.generators.CustomStatisticGenerator_1_16_5;
import net.minestom.generators.DimensionTypeGenerator_1_16_5;
import net.minestom.generators.EnchantmentGenerator_1_16_5;
import net.minestom.generators.EntityGenerator_1_16_5;
import net.minestom.generators.FluidGenerator_1_16_5;
import net.minestom.generators.MapColorGenerator_1_16_5;
import net.minestom.generators.MaterialGenerator_1_16_5;
import net.minestom.generators.MobEffectGenerator_1_16_5;
import net.minestom.generators.ParticleGenerator_1_16_5;
import net.minestom.generators.PotionGenerator_1_16_5;
import net.minestom.generators.SoundGenerator_1_16_5;
import net.minestom.generators.VillagerProfessionGenerator_1_16_5;
import net.minestom.generators.VillagerTypeGenerator_1_16_5;
import net.minestom.generators.common.DataGenerator_1_16_5;
import net.minestom.generators.loot_tables.BlockLootTableGenerator_1_16_5;
import net.minestom.generators.loot_tables.ChestLootTableGenerator_1_16_5;
import net.minestom.generators.loot_tables.EntityLootTableGenerator_1_16_5;
import net.minestom.generators.loot_tables.GameplayLootTableGenerator_1_16_5;
import net.minestom.generators.tags.BlockTagGenerator_1_16_5;
import net.minestom.generators.tags.EntityTypeTagGenerator_1_16_5;
import net.minestom.generators.tags.FluidTagGenerator_1_16_5;
import net.minestom.generators.tags.ItemTagGenerator_1_16_5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

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
            default:
            case MC_1_16:
            case MC_1_16_1:
            case MC_1_16_2:
            case MC_1_16_3:
            case MC_1_16_4:
            case MC_1_16_5: {
                // Prepare all DataGenerators
                DataGenerator_1_16_5.prepare();

                DataGenHolder.addGenerator(DataGenType.ATTRIBUTES, new AttributeGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.BIOMES, new BiomeGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.BLOCK_ENTITIES, new BlockEntityGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.BLOCK_PROPERTIES, new BlockPropertyGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.BLOCKS, new BlockGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.CUSTOM_STATISTICS, new CustomStatisticGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.DIMENSION_TYPES, new DimensionTypeGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.ENCHANTMENTS, new EnchantmentGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.ENTITIES, new EntityGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.FLUIDS, new FluidGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.MATERIALS, new MaterialGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.MAP_COLORS, new MapColorGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.PARTICLES, new ParticleGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.MOB_EFFECTS, new MobEffectGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.POTIONS, new PotionGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.SOUNDS, new SoundGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.VILLAGER_PROFESSIONS, new VillagerProfessionGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.VILLAGER_TYPES, new VillagerTypeGenerator_1_16_5());

                DataGenHolder.addGenerator(DataGenType.BLOCK_TAGS, new BlockTagGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.ENTITY_TYPE_TAGS, new EntityTypeTagGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.FLUID_TAGS, new FluidTagGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.ITEM_TAGS, new ItemTagGenerator_1_16_5());

                DataGenHolder.addGenerator(DataGenType.BLOCK_LOOT_TABLES, new BlockLootTableGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.CHEST_LOOT_TABLES, new ChestLootTableGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.ENTITY_LOOT_TABLES, new EntityLootTableGenerator_1_16_5());
                DataGenHolder.addGenerator(DataGenType.GAMEPLAY_LOOT_TABLES, new GameplayLootTableGenerator_1_16_5());
                break;
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
        MC_1_16_5;

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
            }
            return null;
        }
    }
}
