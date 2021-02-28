package com.minestom.data_generator;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class GeneratedItem {
    private final String id;
    private final String itemCategory;
    private final boolean damageable;
    private final int maxStackSize;
    private final int maxDurability;
    private final boolean complex;
    private final boolean edible;
    private final boolean fireResistant;
    private final String descriptionId;
    private final GeneratedItemFoodProperties foodProperties;

    public GeneratedItem(
            String id,
            String itemCategory,
            boolean damageable,
            int maxStackSize,
            int maxDurability,
            boolean complex,
            boolean edible,
            boolean fireResistant,
            String descriptionId,
            GeneratedItemFoodProperties foodProperties
    ) {
        this.id = id;
        this.itemCategory = itemCategory;
        this.damageable = damageable;
        this.maxStackSize = maxStackSize;
        this.maxDurability = maxDurability;
        this.complex = complex;
        this.edible = edible;
        this.fireResistant = fireResistant;
        this.descriptionId = descriptionId;
        this.foodProperties = foodProperties;
    }

    public static class GeneratedItemFoodProperties {
        private final boolean alwaysEdible;
        private final boolean fastFood;
        private final int nutrition;
        private final float saturationModifier;
        private final String effects;

        public GeneratedItemFoodProperties(
                boolean alwaysEdible,
                boolean fastFood,
                int nutrition,
                float saturationModifier,
                String effects
        ) {
            this.alwaysEdible = alwaysEdible;
            this.fastFood = fastFood;
            this.nutrition = nutrition;
            this.saturationModifier = saturationModifier;
            this.effects = effects;
        }
    }
}
