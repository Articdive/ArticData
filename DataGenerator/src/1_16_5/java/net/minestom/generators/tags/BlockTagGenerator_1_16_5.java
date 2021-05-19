package net.minestom.generators.tags;

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

public final class BlockTagGenerator_1_16_5 extends DataGenerator_1_16_5<Void> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlockTagGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        // Not required for block tags
    }

    @Override
    public JsonArray generate() {
        File tagFolder = new File(dataFolder, "tags");
        File blockTagsFolder = new File(tagFolder, "blocks");

        File[] children = blockTagsFolder.listFiles();
        if (children != null) {
            JsonArray blockTags = new JsonArray();
            for (File file : children) {
                JsonObject blockTag;
                try {
                    blockTag = JsonOutputter.GSON.fromJson(new JsonReader(new FileReader(file)), JsonObject.class);
                } catch (FileNotFoundException e) {
                    LOGGER.error("Failed to read block tag located at '" + file + "'.", e);
                    continue;
                }
                String fileName = file.getName();
                // Remove .json
                blockTag.addProperty("tagName", fileName.substring(0, fileName.length() - 5));
                blockTags.add(blockTag);
            }
            return blockTags;
        } else {
            LOGGER.error("Failed to find block tags in data folder.");
            return new JsonArray();
        }
    }
}
