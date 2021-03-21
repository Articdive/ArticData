package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SmoothSandstoneSlab {
  public static final BlockState SMOOTH_SANDSTONE_SLAB_0 = new BlockState((short) 10829, Block.SMOOTH_SANDSTONE_SLAB);

  public static final BlockState SMOOTH_SANDSTONE_SLAB_1 = new BlockState((short) 10830, Block.SMOOTH_SANDSTONE_SLAB);

  public static final BlockState SMOOTH_SANDSTONE_SLAB_2 = new BlockState((short) 10831, Block.SMOOTH_SANDSTONE_SLAB);

  public static final BlockState SMOOTH_SANDSTONE_SLAB_3 = new BlockState((short) 10832, Block.SMOOTH_SANDSTONE_SLAB);

  public static final BlockState SMOOTH_SANDSTONE_SLAB_4 = new BlockState((short) 10833, Block.SMOOTH_SANDSTONE_SLAB);

  public static final BlockState SMOOTH_SANDSTONE_SLAB_5 = new BlockState((short) 10834, Block.SMOOTH_SANDSTONE_SLAB);

  public static void initStates() {
    Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_0);
    Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_1);
    Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_2);
    Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_3);
    Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_4);
    Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_5);
  }
}
