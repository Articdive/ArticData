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

public final class EntityTypeTagGenerator_1_16_5 extends DataGenerator_1_16_5<Void> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EntityTypeTagGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        // Not required for entity type tags.
    }

    @Override
    public JsonArray generate() {
        File tagFolder = new File(dataFolder, "tags");
        File entityTypeTagsFolder = new File(tagFolder, "entity_types");

        File[] children = entityTypeTagsFolder.listFiles();
        if (children != null) {
            JsonArray entityTypeTags = new JsonArray();
            for (File file : children) {
                JsonObject entityTypeTag;
                try {
                    entityTypeTag = JsonOutputter.GSON.fromJson(new JsonReader(new FileReader(file)), JsonObject.class);
                } catch (FileNotFoundException e) {
                    LOGGER.error("Failed to read entity type tag located at '" + file + "'.", e);
                    continue;
                }
                String fileName = file.getName();
                // Remove .json
                entityTypeTag.addProperty("tagName", fileName.substring(0, fileName.length() - 5));
                entityTypeTags.add(entityTypeTag);
            }
            return entityTypeTags;
        } else {
            LOGGER.error("Failed to find entity type tags in data folder.");
            return new JsonArray();
        }
    }
}
