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

public final class FluidTagGenerator_1_16_5 extends DataGenerator_1_16_5<Void> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FluidTagGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        // Not required for fluid tags
    }

    @Override
    public JsonArray generate() {
        File tagFolder = new File(dataFolder, "tags");
        File fluidTagsFolder = new File(tagFolder, "fluids");

        File[] children = fluidTagsFolder.listFiles();
        if (children != null) {
            JsonArray fluidTags = new JsonArray();
            for (File file : children) {
                JsonObject fluidTag;
                try {
                    fluidTag = JsonOutputter.GSON.fromJson(new JsonReader(new FileReader(file)), JsonObject.class);
                } catch (FileNotFoundException e) {
                    LOGGER.error("Failed to read fluid tag located at '" + file + "'.", e);
                    continue;
                }
                String fileName = file.getName();
                // Remove .json
                fluidTag.addProperty("tagName", fileName.substring(0, fileName.length() - 5));
                fluidTags.add(fluidTag);
            }
            return fluidTags;
        } else {
            LOGGER.error("Failed to find fluid tags in data folder.");
            return new JsonArray();
        }
    }
}
