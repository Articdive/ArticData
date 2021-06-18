package de.articdive.articdata.generators.tags;

import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import de.articdive.articdata.datagen.JsonOutputter;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class FluidTagGenerator_1_16_5 extends DataGenerator_1_16_5<Void> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FluidTagGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        // Not required for fluid tags
    }

    @Override
    public JsonObject generate() {
        File tagFolder = new File(dataFolder, "tags");
        File fluidTagsFolder = new File(tagFolder, "fluids");

        File[] listedFiles = fluidTagsFolder.listFiles();
        if (listedFiles != null) {
            List<File> children = new ArrayList<>(Arrays.asList(listedFiles));
            JsonObject fluidTags = new JsonObject();
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
                JsonObject fluidTag;
                try {
                    fluidTag = JsonOutputter.GSON.fromJson(new JsonReader(new FileReader(file)), JsonObject.class);
                } catch (FileNotFoundException e) {
                    LOGGER.error("Failed to read fluid tag located at '" + file + "'.", e);
                    continue;
                }
                String fileName = file.getAbsolutePath().substring(fluidTagsFolder.getAbsolutePath().length() + 1);
                // Make sure we use the correct slashes.
                fileName = fileName.replace("\\", "/");
                // Remove .json (substring of 5)
                String tagName = fileName.substring(0, fileName.length() - 5);

                fluidTags.add("minecraft:" + tagName, fluidTag);
            }
            return fluidTags;
        } else {
            LOGGER.error("Failed to find fluid tags in data folder.");
            return new JsonObject();
        }
    }
}
