package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SmoothStoneSlab {
  public static final BlockState SMOOTH_STONE_SLAB_0 = new BlockState((short) 8346, Block.SMOOTH_STONE_SLAB);

  public static final BlockState SMOOTH_STONE_SLAB_1 = new BlockState((short) 8347, Block.SMOOTH_STONE_SLAB);

  public static final BlockState SMOOTH_STONE_SLAB_2 = new BlockState((short) 8348, Block.SMOOTH_STONE_SLAB);

  public static final BlockState SMOOTH_STONE_SLAB_3 = new BlockState((short) 8349, Block.SMOOTH_STONE_SLAB);

  public static final BlockState SMOOTH_STONE_SLAB_4 = new BlockState((short) 8350, Block.SMOOTH_STONE_SLAB);

  public static final BlockState SMOOTH_STONE_SLAB_5 = new BlockState((short) 8351, Block.SMOOTH_STONE_SLAB);

  public static void initStates() {
    Block.SMOOTH_STONE_SLAB.addBlockState(SMOOTH_STONE_SLAB_0);
    Block.SMOOTH_STONE_SLAB.addBlockState(SMOOTH_STONE_SLAB_1);
    Block.SMOOTH_STONE_SLAB.addBlockState(SMOOTH_STONE_SLAB_2);
    Block.SMOOTH_STONE_SLAB.addBlockState(SMOOTH_STONE_SLAB_3);
    Block.SMOOTH_STONE_SLAB.addBlockState(SMOOTH_STONE_SLAB_4);
    Block.SMOOTH_STONE_SLAB.addBlockState(SMOOTH_STONE_SLAB_5);
  }
}
