package com.minestom.data_generator;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class DataGenerator {
    public static void main(String[] args) {
        Set<ResourceLocation> blockRLs = Registry.BLOCK.keySet();
        for (ResourceLocation blockRL : blockRLs) {
            Block b = Registry.BLOCK.get(blockRL);
            System.out.println(b.getDescriptionId() + ": Explosion Resistance: " + b.getExplosionResistance());
        }
    }
}
