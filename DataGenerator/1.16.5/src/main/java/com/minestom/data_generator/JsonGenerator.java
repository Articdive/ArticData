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
        String filename = version + "_blocks.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedBlocks, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }

    public void outputEntities(List<GeneratedEntity> generatedEntities) {
        String filename = version + "_entities.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedEntities, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }

    public void outputBlockEntites(List<GeneratedBlockEntity> generatedBlockEntities) {
        String filename = version + "_block_entities.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedBlockEntities, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }

    public void outputItems(List<GeneratedItem> generatedItems) {
        String filename = version + "_items.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedItems, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }


    public void outputPotionEffects(List<GeneratedEffect> generatedEffects) {
        String filename = version + "_effects.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedEffects, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }

    public void outputAttributes(List<GeneratedAttribute> generatedAttributes) {
        String filename = version + "_attributes.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedAttributes, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }


    public void outputMapColors(List<GeneratedMapColor> generatedMapColors) {
        String filename = version + "_map_colors.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedMapColors, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }

    public void outputEnchantments(List<GeneratedEnchantment> generatedEnchantments) {
        String filename = version + "_enchantments.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedEnchantments, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }

    public void outputParticles(List<GeneratedParticle> generatedParticles) {
        String filename = version + "_particles.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedParticles, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }

    public void outputSounds(List<GeneratedSound> generatedSounds) {
        String filename = version + "_sounds.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedSounds, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }

    public void outputVillagerProfessions(List<GeneratedVillagerProfession> generatedVillagerProfessions) {
        String filename = version + "_villager_professions.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedVillagerProfessions, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }

    public void outputBiomes(List<GeneratedBiome> generatedBiomes) {
        String filename = version + "_biomes.json";
        try {
            Writer writer = new FileWriter(new File(OUTPUT_FOLDER, filename), false);
            GSON.toJson(generatedBiomes, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            LOGGER.error("Something went wrong while writing data to " + filename + ".", e);
        }
    }
}
