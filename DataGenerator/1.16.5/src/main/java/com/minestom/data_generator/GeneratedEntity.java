package com.minestom.data_generator;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public final class GeneratedEntity {
    private final String id;
    private final String category;
    private final boolean fireImmune;
    private final double height;
    private final double width;
    private final boolean fixedDimensions;

    public GeneratedEntity(
            @NotNull String id,
            @NotNull String category,
            boolean fireImmune,
            double height,
            double width,
            boolean fixedDimensions
    ) {
        this.id = id;
        this.category = category;
        this.fireImmune = fireImmune;
        this.height = height;
        this.width = width;
        this.fixedDimensions = fixedDimensions;
    }
}
