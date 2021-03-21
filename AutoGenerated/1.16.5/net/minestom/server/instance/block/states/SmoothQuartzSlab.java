package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SmoothQuartzSlab {
  public static final BlockState SMOOTH_QUARTZ_SLAB_0 = new BlockState((short) 10835, Block.SMOOTH_QUARTZ_SLAB);

  public static final BlockState SMOOTH_QUARTZ_SLAB_1 = new BlockState((short) 10836, Block.SMOOTH_QUARTZ_SLAB);

  public static final BlockState SMOOTH_QUARTZ_SLAB_2 = new BlockState((short) 10837, Block.SMOOTH_QUARTZ_SLAB);

  public static final BlockState SMOOTH_QUARTZ_SLAB_3 = new BlockState((short) 10838, Block.SMOOTH_QUARTZ_SLAB);

  public static final BlockState SMOOTH_QUARTZ_SLAB_4 = new BlockState((short) 10839, Block.SMOOTH_QUARTZ_SLAB);

  public static final BlockState SMOOTH_QUARTZ_SLAB_5 = new BlockState((short) 10840, Block.SMOOTH_QUARTZ_SLAB);

  public static void initStates() {
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_0);
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_1);
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_2);
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_3);
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_4);
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_5);
  }
}
