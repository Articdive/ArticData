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

public final class ItemTagGenerator_1_16_5 extends DataGenerator_1_16_5<Void> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemTagGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        // Not required for item tags
    }

    @Override
    public JsonArray generate() {
        File tagFolder = new File(dataFolder, "tags");
        File itemTagsFolder = new File(tagFolder, "items");

        File[] children = itemTagsFolder.listFiles();
        if (children != null) {
            JsonArray fluidTags = new JsonArray();
            for (File file : children) {
                JsonObject itemTag;
                try {
                    itemTag = JsonOutputter.GSON.fromJson(new JsonReader(new FileReader(file)), JsonObject.class);
                } catch (FileNotFoundException e) {
                    LOGGER.error("Failed to read item tag located at '" + file + "'.", e);
                    continue;
                }
                String fileName = file.getName();
                // Remove .json
                itemTag.addProperty("tagName", fileName.substring(0, fileName.length() - 5));
                fluidTags.add(itemTag);
            }
            return fluidTags;
        } else {
            LOGGER.error("Failed to find item tags in data folder.");
            return new JsonArray();
        }
    }
}
