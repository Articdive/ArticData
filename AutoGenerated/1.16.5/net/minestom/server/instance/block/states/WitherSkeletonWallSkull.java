package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WitherSkeletonWallSkull {
  public static final BlockState WITHER_SKELETON_WALL_SKULL_0 = new BlockState((short) 6530, Block.WITHER_SKELETON_WALL_SKULL);

  public static final BlockState WITHER_SKELETON_WALL_SKULL_1 = new BlockState((short) 6531, Block.WITHER_SKELETON_WALL_SKULL);

  public static final BlockState WITHER_SKELETON_WALL_SKULL_2 = new BlockState((short) 6532, Block.WITHER_SKELETON_WALL_SKULL);

  public static final BlockState WITHER_SKELETON_WALL_SKULL_3 = new BlockState((short) 6533, Block.WITHER_SKELETON_WALL_SKULL);

  public static void initStates() {
    Block.WITHER_SKELETON_WALL_SKULL.addBlockState(WITHER_SKELETON_WALL_SKULL_0);
    Block.WITHER_SKELETON_WALL_SKULL.addBlockState(WITHER_SKELETON_WALL_SKULL_1);
    Block.WITHER_SKELETON_WALL_SKULL.addBlockState(WITHER_SKELETON_WALL_SKULL_2);
    Block.WITHER_SKELETON_WALL_SKULL.addBlockState(WITHER_SKELETON_WALL_SKULL_3);
  }
}
