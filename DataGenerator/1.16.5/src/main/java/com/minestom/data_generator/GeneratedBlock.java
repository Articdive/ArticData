package com.minestom.data_generator;

import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public final class GeneratedBlock {
    private final String id;
    private final double blastResistance;
    private final double friction;
    private final double speedFactor;
    private final double jumpFactor;
    private final String itemEquivilant;
    private final String descriptionId;
    private final List<GeneratedBlockState> blockStates;

    public GeneratedBlock(
            @NotNull String id,
            double blastResistance,
            double friction,
            double speedFactor,
            double jumpFactor,
            @NotNull String itemEquivilant,
            @NotNull String descriptionId,
            List<GeneratedBlockState> blockStates
    ) {
        this.id = id;
        this.blastResistance = blastResistance;
        this.friction = friction;
        this.speedFactor = speedFactor;
        this.jumpFactor = jumpFactor;
        this.itemEquivilant = itemEquivilant;
        this.descriptionId = descriptionId;
        this.blockStates = blockStates;
    }

    public static final class GeneratedBlockState {
        private final int id;
        private final double destroySpeed;
        private final int lightEmission;
        private final GeneratedBlockStateMaterial material;
        private final boolean occludes;

        public GeneratedBlockState(
                int id,
                double destroySpeed,
                int lightEmission,
                boolean occludes, 
                GeneratedBlockStateMaterial material
        ) {
            this.id = id;
            this.destroySpeed = destroySpeed;
            this.lightEmission = lightEmission;
            this.occludes = occludes;
            this.material = material;
        }

        public static final class GeneratedBlockStateMaterial {
            private final String pushReaction;
            private final boolean blocksMotion;
            private final boolean flammable;
            private final boolean liquid;
            private final boolean replaceable;
            private final boolean solid;
            private final boolean solidBlocking;
            private final int mapColorId;
            private final String boundingBox;

            public GeneratedBlockStateMaterial(
                    @NotNull String pushReaction,
                    boolean blocksMotion,
                    boolean flammable,
                    boolean liquid,
                    boolean replaceable,
                    boolean solid,
                    boolean solidBlocking,
                    int mapColorId,
                    @NotNull String boundingBox
            ) {
                this.pushReaction = pushReaction;
                this.blocksMotion = blocksMotion;
                this.flammable = flammable;
                this.liquid = liquid;
                this.replaceable = replaceable;
                this.solid = solid;
                this.solidBlocking = solidBlocking;
                this.mapColorId = mapColorId;
                this.boundingBox = boundingBox;
            }
        }
    }
}
