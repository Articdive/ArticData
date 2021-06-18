package de.articdive.articdata.datagen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public final class JsonOutputter {
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonOutputter.class);
    private final String versionPrefix;
    private final File outputDirectory;

    JsonOutputter(String versionPrefix, File outputDirectory) {
        this.versionPrefix = versionPrefix;
        // Create output folder
        if (!outputDirectory.exists() && !outputDirectory.mkdirs()) {
            throw new ExceptionInInitializerError("Failed to create work folder.");
        }
        this.outputDirectory = outputDirectory;
    }

    public void output(JsonElement output, String fileName) {
        if (fileName.contains("/")) {
            String[] split = fileName.split("/");
            output(output, split[1], split[0]);
        } else {
            output(output, fileName, outputDirectory);
        }
    }

    private void output(JsonElement output, String fileName, String subFolder) {
        File outputSubDirectory = new File(this.outputDirectory, versionPrefix + subFolder);
        if (!outputSubDirectory.exists() && !outputSubDirectory.mkdirs()) {
            throw new ExceptionInInitializerError("Failed to create work sub-directory.");
        }
        output(output, fileName, outputSubDirectory);
    }

    private void output(JsonElement output, String fileName, File outputDirectory) {
        String filename = versionPrefix + fileName + ".json";
        try {
            Writer writer = new FileWriter(new File(outputDirectory, filename), false);
            GSON.toJson(output, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }
}
