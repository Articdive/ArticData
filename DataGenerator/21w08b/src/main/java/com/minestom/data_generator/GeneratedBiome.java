package com.minestom.data_generator;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public final class GeneratedBiome {
    private final String id;
    private final boolean humid;
    private final float scale;
    private final float depth;
    private final float baseTemperature;
    private final float downfall;
    private final String precipitation;
    private final String biomeCategory;
    private final GeneratedBiomeEffects generatedBiomeEffects;

    public GeneratedBiome(String id, boolean humid, float scale, float depth, float baseTemperature, float downfall, String precipitation, String biomeCategory, GeneratedBiomeEffects generatedBiomeEffects) {
        this.id = id;
        this.humid = humid;
        this.scale = scale;
        this.depth = depth;
        this.baseTemperature = baseTemperature;
        this.downfall = downfall;
        this.precipitation = precipitation;
        this.biomeCategory = biomeCategory;
        this.generatedBiomeEffects = generatedBiomeEffects;
    }

    public static final class GeneratedBiomeEffects {
        private final int fogColor;
        private final int waterColor;
        private final int waterFogColor;
        private final int skyColor;
        private final Integer foliageColorOverride;
        private final Integer grassColorOverride;
        private final String grassColorModifier;

        public GeneratedBiomeEffects(
                int fogColor,
                int waterColor,
                int waterFogColor,
                int skyColor,
                Integer foliageColorOverride,
                Integer grassColorOverride,
                String grassColorModifier) {
            this.fogColor = fogColor;
            this.waterColor = waterColor;
            this.waterFogColor = waterFogColor;
            this.skyColor = skyColor;
            this.foliageColorOverride = foliageColorOverride;
            this.grassColorOverride = grassColorOverride;
            this.grassColorModifier = grassColorModifier;
        }
    }
}
