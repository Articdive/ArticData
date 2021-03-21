package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SandstoneSlab {
  public static final BlockState SANDSTONE_SLAB_0 = new BlockState((short) 8352, Block.SANDSTONE_SLAB);

  public static final BlockState SANDSTONE_SLAB_1 = new BlockState((short) 8353, Block.SANDSTONE_SLAB);

  public static final BlockState SANDSTONE_SLAB_2 = new BlockState((short) 8354, Block.SANDSTONE_SLAB);

  public static final BlockState SANDSTONE_SLAB_3 = new BlockState((short) 8355, Block.SANDSTONE_SLAB);

  public static final BlockState SANDSTONE_SLAB_4 = new BlockState((short) 8356, Block.SANDSTONE_SLAB);

  public static final BlockState SANDSTONE_SLAB_5 = new BlockState((short) 8357, Block.SANDSTONE_SLAB);

  public static void initStates() {
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_0);
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_1);
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_2);
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_3);
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_4);
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_5);
  }
}
