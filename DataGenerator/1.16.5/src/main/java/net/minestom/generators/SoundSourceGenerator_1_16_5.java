package net.minestom.generators;

import com.google.gson.JsonObject;
import net.minecraft.sounds.SoundSource;
import net.minestom.generators.common.DataGenerator_1_16_5;
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
    public JsonObject generate() {
        JsonObject sounds = new JsonObject();

        for (SoundSource soundSource : SoundSource.values()) {
            JsonObject sound = new JsonObject();
            sound.addProperty("mojangName", soundSource.name());

            sounds.add(soundSource.getName(), sound);
        }

        return sounds;
    }
}
