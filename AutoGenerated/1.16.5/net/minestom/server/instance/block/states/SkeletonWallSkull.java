package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SkeletonWallSkull {
  public static final BlockState SKELETON_WALL_SKULL_0 = new BlockState((short) 6510, Block.SKELETON_WALL_SKULL);

  public static final BlockState SKELETON_WALL_SKULL_1 = new BlockState((short) 6511, Block.SKELETON_WALL_SKULL);

  public static final BlockState SKELETON_WALL_SKULL_2 = new BlockState((short) 6512, Block.SKELETON_WALL_SKULL);

  public static final BlockState SKELETON_WALL_SKULL_3 = new BlockState((short) 6513, Block.SKELETON_WALL_SKULL);

  public static void initStates() {
    Block.SKELETON_WALL_SKULL.addBlockState(SKELETON_WALL_SKULL_0);
    Block.SKELETON_WALL_SKULL.addBlockState(SKELETON_WALL_SKULL_1);
    Block.SKELETON_WALL_SKULL.addBlockState(SKELETON_WALL_SKULL_2);
    Block.SKELETON_WALL_SKULL.addBlockState(SKELETON_WALL_SKULL_3);
  }
}
