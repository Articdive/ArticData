package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SmoothRedSandstoneSlab {
  public static final BlockState SMOOTH_RED_SANDSTONE_SLAB_0 = new BlockState((short) 10799, Block.SMOOTH_RED_SANDSTONE_SLAB);

  public static final BlockState SMOOTH_RED_SANDSTONE_SLAB_1 = new BlockState((short) 10800, Block.SMOOTH_RED_SANDSTONE_SLAB);

  public static final BlockState SMOOTH_RED_SANDSTONE_SLAB_2 = new BlockState((short) 10801, Block.SMOOTH_RED_SANDSTONE_SLAB);

  public static final BlockState SMOOTH_RED_SANDSTONE_SLAB_3 = new BlockState((short) 10802, Block.SMOOTH_RED_SANDSTONE_SLAB);

  public static final BlockState SMOOTH_RED_SANDSTONE_SLAB_4 = new BlockState((short) 10803, Block.SMOOTH_RED_SANDSTONE_SLAB);

  public static final BlockState SMOOTH_RED_SANDSTONE_SLAB_5 = new BlockState((short) 10804, Block.SMOOTH_RED_SANDSTONE_SLAB);

  public static void initStates() {
    Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockState(SMOOTH_RED_SANDSTONE_SLAB_0);
    Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockState(SMOOTH_RED_SANDSTONE_SLAB_1);
    Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockState(SMOOTH_RED_SANDSTONE_SLAB_2);
    Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockState(SMOOTH_RED_SANDSTONE_SLAB_3);
    Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockState(SMOOTH_RED_SANDSTONE_SLAB_4);
    Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockState(SMOOTH_RED_SANDSTONE_SLAB_5);
  }
}
