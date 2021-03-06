package com.minestom.data_generator;

import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public final class GeneratedBlockEntity {
    private final String id;
    private final List<GeneratedBlockEntityBlock> validBlocks;

    public GeneratedBlockEntity(
            @NotNull String id,
            List<GeneratedBlockEntityBlock> validBlocks
    ) {
        this.id = id;
        this.validBlocks = validBlocks;
    }

    public static final class GeneratedBlockEntityBlock {
        private final String id;

        public GeneratedBlockEntityBlock(
                @NotNull String id
        ) {
            this.id = id;
        }
    }
}
