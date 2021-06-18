package de.articdive.articdata.generators.tags;

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

public final class GameEventTagGenerator_1_17 extends DataGenerator_1_16_5<Void> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GameEventTagGenerator_1_17.class);

    @Override
    public void generateNames() {
        // Not required for item tags
    }

    @Override
    public JsonObject generate() {
        File tagFolder = new File(dataFolder, "tags");
        File itemTagsFolder = new File(tagFolder, "game_events");

        File[] listedFiles = itemTagsFolder.listFiles();
        if (listedFiles != null) {
            List<File> children = new ArrayList<>(Arrays.asList(listedFiles));
            JsonObject itemTags = new JsonObject();
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
                JsonObject gameEventTag;
                try {
                    gameEventTag = JsonOutputter.GSON.fromJson(new JsonReader(new FileReader(file)), JsonObject.class);
                } catch (FileNotFoundException e) {
                    LOGGER.error("Failed to read game event tag located at '" + file + "'.", e);
                    continue;
                }
                String fileName = file.getAbsolutePath().substring(itemTagsFolder.getAbsolutePath().length() + 1);
                // Make sure we use the correct slashes.
                fileName = fileName.replace("\\", "/");
                // Remove .json (substring of 5)
                String tagName = fileName.substring(0, fileName.length() - 5);
                itemTags.add(tagName, gameEventTag);
            }
            return itemTags;
        } else {
            LOGGER.error("Failed to find item tags in data folder.");
            return new JsonObject();
        }
    }
}
