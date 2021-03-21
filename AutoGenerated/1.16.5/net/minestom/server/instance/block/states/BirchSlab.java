package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BirchSlab {
  public static final BlockState BIRCH_SLAB_0 = new BlockState((short) 8316, Block.BIRCH_SLAB);

  public static final BlockState BIRCH_SLAB_1 = new BlockState((short) 8317, Block.BIRCH_SLAB);

  public static final BlockState BIRCH_SLAB_2 = new BlockState((short) 8318, Block.BIRCH_SLAB);

  public static final BlockState BIRCH_SLAB_3 = new BlockState((short) 8319, Block.BIRCH_SLAB);

  public static final BlockState BIRCH_SLAB_4 = new BlockState((short) 8320, Block.BIRCH_SLAB);

  public static final BlockState BIRCH_SLAB_5 = new BlockState((short) 8321, Block.BIRCH_SLAB);

  public static void initStates() {
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_0);
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_1);
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_2);
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_3);
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_4);
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_5);
  }
}
