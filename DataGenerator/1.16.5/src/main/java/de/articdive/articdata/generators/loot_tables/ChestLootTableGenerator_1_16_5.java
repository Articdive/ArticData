package de.articdive.articdata.generators.loot_tables;

import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import de.articdive.articdata.datagen.JsonOutputter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ChestLootTableGenerator_1_16_5 extends DataGenerator_1_16_5<Void> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChestLootTableGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        // Not required for block loot tables
    }

    @Override
    public JsonObject generate() {
        File lootTablesFolder = new File(dataFolder, "loot_tables");
        File chestTables = new File(lootTablesFolder, "chests");

        File[] listedFiles = chestTables.listFiles();
        if (listedFiles != null) {
            List<File> children = new ArrayList<>(Arrays.asList(listedFiles));
            JsonObject chestLootTables = new JsonObject();
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
                JsonObject chestLootTable;
                try {
                    chestLootTable = JsonOutputter.GSON.fromJson(new JsonReader(new FileReader(file)), JsonObject.class);
                } catch (FileNotFoundException e) {
                    LOGGER.error("Failed to read chest loot table located at '" + file + "'.", e);
                    continue;
                }
                String fileName = file.getAbsolutePath().substring(chestTables.getAbsolutePath().length() + 1);
                // Make sure we use the correct slashes.
                fileName = fileName.replace("\\", "/");
                // Remove .json by removing last 5 chars of the name.
                String tableName = fileName.substring(0, fileName.length() - 5);
                chestLootTables.add("minecraft:" + tableName, chestLootTable);
            }
            return chestLootTables;
        } else {
            LOGGER.error("Failed to find chest loot tables in data folder.");
            return new JsonObject();
        }
    }
}
