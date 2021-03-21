package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedGraniteSlab {
  public static final BlockState POLISHED_GRANITE_SLAB_0 = new BlockState((short) 10793, Block.POLISHED_GRANITE_SLAB);

  public static final BlockState POLISHED_GRANITE_SLAB_1 = new BlockState((short) 10794, Block.POLISHED_GRANITE_SLAB);

  public static final BlockState POLISHED_GRANITE_SLAB_2 = new BlockState((short) 10795, Block.POLISHED_GRANITE_SLAB);

  public static final BlockState POLISHED_GRANITE_SLAB_3 = new BlockState((short) 10796, Block.POLISHED_GRANITE_SLAB);

  public static final BlockState POLISHED_GRANITE_SLAB_4 = new BlockState((short) 10797, Block.POLISHED_GRANITE_SLAB);

  public static final BlockState POLISHED_GRANITE_SLAB_5 = new BlockState((short) 10798, Block.POLISHED_GRANITE_SLAB);

  public static void initStates() {
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_0);
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_1);
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_2);
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_3);
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_4);
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_5);
  }
}
