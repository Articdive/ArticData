package net.minestom.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.material.Fluid;
import net.minestom.generators.common.DataGenerator_1_16_5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Optional;
import java.util.Set;

public final class BiomeGenerator_1_16_5 extends DataGenerator_1_16_5<Fluid> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BiomeGenerator_1_16_5.class);
    @Override
    public void generateNames() {
        // Not required for biomes.
    }

    @SuppressWarnings("unchecked")
    @Override
    public JsonArray generate() {
        Set<ResourceLocation> biomeRLs = BuiltinRegistries.BIOME.keySet();
        JsonArray biomes = new JsonArray();

        for (ResourceLocation biomeRL : biomeRLs) {
            Biome b = BuiltinRegistries.BIOME.get(biomeRL);
            if (b == null) {
                continue;
            }
            JsonObject biome = new JsonObject();

            biome.addProperty("id", biomeRL.toString());
            biome.addProperty("humid", b.isHumid());
            biome.addProperty("scale", b.getScale());
            biome.addProperty("depth", b.getDepth());
            biome.addProperty("temperature", b.getBaseTemperature());
            biome.addProperty("downfall", b.getDownfall());
            biome.addProperty("precipitation", b.getPrecipitation().name());
            biome.addProperty("category", b.getBiomeCategory().name());

            {
                // Use reflection to access SpecialBiomeEffects (why the hell is this private anyway?)
                JsonObject biomeEffects = new JsonObject();
                try {
                    BiomeSpecialEffects bse = b.getSpecialEffects();
                    Field fcField = BiomeSpecialEffects.class.getDeclaredField("fogColor");
                    Field wcField = BiomeSpecialEffects.class.getDeclaredField("waterColor");
                    Field wfcField = BiomeSpecialEffects.class.getDeclaredField("waterFogColor");
                    Field scField = BiomeSpecialEffects.class.getDeclaredField("skyColor");
                    Field fcoField = BiomeSpecialEffects.class.getDeclaredField("foliageColorOverride");
                    Field gcoField = BiomeSpecialEffects.class.getDeclaredField("grassColorOverride");
                    Field gcmField = BiomeSpecialEffects.class.getDeclaredField("grassColorModifier");

                    fcField.setAccessible(true);
                    wcField.setAccessible(true);
                    wfcField.setAccessible(true);
                    scField.setAccessible(true);
                    fcoField.setAccessible(true);
                    gcoField.setAccessible(true);
                    gcmField.setAccessible(true);

                    int fogColor = fcField.getInt(bse);
                    int waterColor = wcField.getInt(bse);
                    int waterFogColor = wfcField.getInt(bse);
                    int skyColor = scField.getInt(bse);
                    Optional<Integer> foliageColorOverride = (Optional<Integer>) fcoField.get(bse);
                    Optional<Integer> grassColorOverride = (Optional<Integer>) gcoField.get(bse);
                    BiomeSpecialEffects.GrassColorModifier grassColorModifier = (BiomeSpecialEffects.GrassColorModifier) gcmField.get(bse);

                    biomeEffects.addProperty("fogColor", fogColor);
                    biomeEffects.addProperty("waterColor", waterColor);
                    biomeEffects.addProperty("waterFogColor", waterFogColor);
                    biomeEffects.addProperty("skyColor", skyColor);
                    biomeEffects.addProperty("foliageColorOverride", foliageColorOverride.orElse(null));
                    biomeEffects.addProperty("grassColorOverride", grassColorOverride.orElse(null));
                    biomeEffects.addProperty("grassColorModifier", grassColorModifier.name());
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    LOGGER.error("Failed to get biome effects, skipping biome with ID '" + biomeRL + "'.", e);
                    continue;
                }
                biome.add("effects", biomeEffects);
            }
            biomes.add(biome);
        }
        return biomes;
    }
}
