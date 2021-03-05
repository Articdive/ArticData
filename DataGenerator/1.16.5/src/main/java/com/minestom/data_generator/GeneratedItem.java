package com.minestom.data_generator;

import java.util.List;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public final class GeneratedItem {
    private final String id;
    private final String itemCategory;
    private final boolean damageable;
    private final int maxStackSize;
    private final int maxDurability;
    @ExtraData
    private final boolean complex;
    private final boolean edible;
    private final boolean fireResistant;
    private final String descriptionId;
    @ExtraData
    private final String eatingSound;
    @ExtraData
    private final String drinkingSound;
    private final GeneratedItemFoodProperties foodProperties;

    public GeneratedItem(
            String id,
            String descriptionId,
            String itemCategory,
            boolean damageable,
            int maxStackSize,
            int maxDurability,
            boolean complex,
            boolean edible,
            boolean fireResistant,
            String eatingSound,
            String drinkingSound,
            GeneratedItemFoodProperties foodProperties
    ) {
        this.id = id;
        this.descriptionId = descriptionId;
        this.itemCategory = itemCategory;
        this.damageable = damageable;
        this.maxStackSize = maxStackSize;
        this.maxDurability = maxDurability;
        this.complex = complex;
        this.edible = edible;
        this.fireResistant = fireResistant;
        this.eatingSound = eatingSound;
        this.drinkingSound = drinkingSound;
        this.foodProperties = foodProperties;
    }

    public static final class GeneratedItemFoodProperties {
        private final boolean alwaysEdible;
        private final boolean fastFood;
        private final int nutrition;
        private final float saturationModifier;
        private final List<GeneratedFoodEffect> effects;

        public GeneratedItemFoodProperties(
                boolean alwaysEdible,
                boolean fastFood,
                int nutrition,
                float saturationModifier,
                List<GeneratedFoodEffect> effects
        ) {
            this.alwaysEdible = alwaysEdible;
            this.fastFood = fastFood;
            this.nutrition = nutrition;
            this.saturationModifier = saturationModifier;
            this.effects = effects;
        }

        public static final class GeneratedFoodEffect {
            private final String id;
            private final int amplifier;
            private final int duration;
            private final float chance;

            public GeneratedFoodEffect(String id, int amplifier, int duration, float chance) {
                this.id = id;
                this.amplifier = amplifier;
                this.duration = duration;
                this.chance = chance;
            }
        }
    }
}
