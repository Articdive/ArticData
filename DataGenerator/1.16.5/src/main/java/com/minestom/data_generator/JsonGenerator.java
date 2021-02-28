package com.minestom.data_generator;

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
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private final String version;
    private final File OUTPUT_FOLDER = new File("../output/");

    JsonGenerator(@NotNull String version) {
        this.version = version.replaceAll("\\.", "_");
        // Create output folder
        if (!OUTPUT_FOLDER.exists() && !OUTPUT_FOLDER.mkdirs()) {
            throw new ExceptionInInitializerError("Failed to create work folder.");
        }
    }

    public void outputBlocks(List<GeneratedBlock> generatedBlocks) {
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, version + "_blocks.json"), false);
            GSON.toJson(generatedBlocks, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to blocks.json.", e);
        }
    }

    public void outputEntities(List<GeneratedEntity> generatedEntities) {
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, version + "_entities.json"), false);
            GSON.toJson(generatedEntities, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to entities.json.", e);
        }
    }

    public void outputBlockEntites(List<GeneratedBlockEntity> generatedBlockEntities) {
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, version + "_block_entities.json"), false);
            GSON.toJson(generatedBlockEntities, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to block_entities.json.", e);
        }
    }

    public void outputItems(List<GeneratedItem> generatedItems) {
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, version + "_items.json"), false);
            GSON.toJson(generatedItems, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to items.json.", e);
        }
    }

    public void outputMapColors(List<GeneratedMapColor> generatedMapColors) {
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, version + "_map_colors.json"), false);
            GSON.toJson(generatedMapColors, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to map_colors.json.", e);
        }
    }
}
