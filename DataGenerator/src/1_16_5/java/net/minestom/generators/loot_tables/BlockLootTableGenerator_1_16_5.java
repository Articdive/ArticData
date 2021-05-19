package net.minestom.generators.loot_tables;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import net.minestom.datagen.JsonOutputter;
import net.minestom.generators.common.DataGenerator_1_16_5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class BlockLootTableGenerator_1_16_5 extends DataGenerator_1_16_5<Void> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlockLootTableGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        // Not required for block loot tables
    }

    @Override
    public JsonArray generate() {
        File lootTablesFolder = new File(dataFolder, "loot_tables");
        File blockTables = new File(lootTablesFolder, "blocks");

        File[] listedFiles = blockTables.listFiles();
        if (listedFiles != null) {
            List<File> children = new ArrayList<>(Arrays.asList(listedFiles));
            JsonArray blockLootTables = new JsonArray();
            for (int i = 0; i < children.size(); i++) {
                File file = children.get(i);
                // Add subdirectories files to the for-loop.
                if (file.isDirectory()) {
                    File[] subChildren = file.listFiles();
                    if (subChildren != null) {
                        children.addAll(Arrays.asList(subChildren));
                    }
                    continue;
                }
                JsonObject blockLootTable;
                try {
                    blockLootTable = JsonOutputter.GSON.fromJson(new JsonReader(new FileReader(file)), JsonObject.class);
                } catch (FileNotFoundException e) {
                    LOGGER.error("Failed to read block loot table located at '" + file + "'.", e);
                    continue;
                }
                String fileName = file.getName();
                // Remove .json by removing last 5 chars of the name.
                blockLootTable.addProperty("blockId", "minecraft:" + fileName.substring(0, fileName.length() - 5));
                blockLootTables.add(blockLootTable);
            }
            return blockLootTables;
        } else {
            LOGGER.error("Failed to find block loot tables in data folder.");
            return new JsonArray();
        }
    }
}
