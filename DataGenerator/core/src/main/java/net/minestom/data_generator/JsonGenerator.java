package net.minestom.data_generator;

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
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonGenerator.class);
    private final String version;
    private final File outputDirectory;

    JsonGenerator(@NotNull String version, @NotNull File outputDirectory) {
        this.version = version.replaceAll("\\.", "_");
        // Create output folder
        if (!outputDirectory.exists() && !outputDirectory.mkdirs()) {
            throw new ExceptionInInitializerError("Failed to create work folder.");
        }
        this.outputDirectory = outputDirectory;
    }

    public void output(JsonArray output, String fileName) {
        output(output, fileName, outputDirectory);
    }

    public void output(JsonArray output, String fileName, String subFolder) {
        File outputSubDirectory = new File(this.outputDirectory, version + "_" + subFolder);
        if (!outputSubDirectory.exists() && !outputSubDirectory.mkdirs()) {
            throw new ExceptionInInitializerError("Failed to create work sub-directory.");
        }
        output(output, fileName, outputSubDirectory);
    }

    private void output(JsonArray output, String fileName, File outputDirectory) {
        String filename = version + "_" + fileName + ".json";
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
