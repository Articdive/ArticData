package de.articdive.articdata.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.sounds.SoundSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SoundSourceGenerator_1_16_5 extends DataGenerator_1_16_5<SoundSource> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SoundSourceGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        // Might be possible to remove this.
        // It may appear one day that people need the SoundSource name.
        for (SoundSource soundSource : SoundSource.values()) {
            names.put(soundSource, soundSource.name());
        }
    }

    @Override
    public JsonArray generate() {
        JsonArray sounds = new JsonArray();

        for (SoundSource ss : SoundSource.values()) {
            JsonObject soundSource = new JsonObject();
            soundSource.addProperty("id", ss.ordinal());
            soundSource.addProperty("mojangName", ss.name());
            soundSource.addProperty("type", ss.getName());

            sounds.add(soundSource);
        }

        return sounds;
    }
}
