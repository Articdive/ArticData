package com.minestom.data_generator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public final class JsonGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonGenerator.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final File OUTPUT_FOLDER = new File("../output/");
    private final String version;

    JsonGenerator(@NotNull String version) {
        this.version = version.replaceAll("\\.", "_");
        // Create output folder
        if (!OUTPUT_FOLDER.exists() && !OUTPUT_FOLDER.mkdirs()) {
            throw new ExceptionInInitializerError("Failed to create work folder.");
        }
    }

    public void output(JsonArray output, String fileName) {
        String filename = version + "_" + fileName + ".json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(output, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }
}
