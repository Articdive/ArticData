package com.minestom.data_generator;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public final class GeneratedEnchantment {
    private final String id;
    private final String descriptionId;
    private final int maxLevel;
    private final int minLevel;
    private final String rarity;
    private final boolean curse;
    private final boolean discoverable;
    private final boolean tradeable;
    private final boolean treasureOnly;
    private final String category;

    public GeneratedEnchantment(
            String id,
            String descriptionId,
            int maxLevel,
            int minLevel,
            String rarity,
            boolean curse,
            boolean discoverable,
            boolean tradeable,
            boolean treasureOnly,
            String category
    ) {
        this.id = id;
        this.descriptionId = descriptionId;
        this.maxLevel = maxLevel;
        this.minLevel = minLevel;
        this.rarity = rarity;
        this.curse = curse;
        this.discoverable = discoverable;
        this.tradeable = tradeable;
        this.treasureOnly = treasureOnly;
        this.category = category;
    }
}
