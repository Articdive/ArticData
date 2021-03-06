package com.minestom.data_generator;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public final class JsonGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonGenerator.class);
    private final Gson gson;
    private final String version;
    private final File OUTPUT_FOLDER = new File("../output/");

    JsonGenerator(@NotNull String version, boolean includeExtraData) {
        this.version = version.replaceAll("\\.", "_");
        // Create output folder
        if (!OUTPUT_FOLDER.exists() && !OUTPUT_FOLDER.mkdirs()) {
            throw new ExceptionInInitializerError("Failed to create work folder.");
        }
        var gsonBuilder = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping();
        if (includeExtraData) {
            gson = gsonBuilder.create();
        } else {
            gson = gsonBuilder.setExclusionStrategies(new ExclusionStrategy() {
                @Override
                public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                    // annotation is null, if not applied to the field.
                    return fieldAttributes.getAnnotation(ExtraData.class) != null;
                }

                @Override
                public boolean shouldSkipClass(Class<?> aClass) {
                    return false;
                }
            }).create();
        }
    }

    public <T> void output(List<T> output, String fileName) {
        String filename = version + "_" + fileName + ".json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            gson.toJson(output, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }
}
