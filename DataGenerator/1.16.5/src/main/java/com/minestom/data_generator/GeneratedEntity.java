package com.minestom.data_generator;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public final class GeneratedEntity {
    private final String id;
    private final String descriptionId;
    private final String category;
    private final boolean fireImmune;
    private final float height;
    private final float width;
    private final boolean fixedDimensions;

    public GeneratedEntity(
            @NotNull String id,
            @NotNull String descriptionId,
            @NotNull String category,
            boolean fireImmune,
            float height,
            float width,
            boolean fixedDimensions
    ) {
        this.id = id;
        this.descriptionId = descriptionId;
        this.category = category;
        this.fireImmune = fireImmune;
        this.height = height;
        this.width = width;
        this.fixedDimensions = fixedDimensions;
    }
}
