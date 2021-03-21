package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GraniteSlab {
  public static final BlockState GRANITE_SLAB_0 = new BlockState((short) 10841, Block.GRANITE_SLAB);

  public static final BlockState GRANITE_SLAB_1 = new BlockState((short) 10842, Block.GRANITE_SLAB);

  public static final BlockState GRANITE_SLAB_2 = new BlockState((short) 10843, Block.GRANITE_SLAB);

  public static final BlockState GRANITE_SLAB_3 = new BlockState((short) 10844, Block.GRANITE_SLAB);

  public static final BlockState GRANITE_SLAB_4 = new BlockState((short) 10845, Block.GRANITE_SLAB);

  public static final BlockState GRANITE_SLAB_5 = new BlockState((short) 10846, Block.GRANITE_SLAB);

  public static void initStates() {
    Block.GRANITE_SLAB.addBlockState(GRANITE_SLAB_0);
    Block.GRANITE_SLAB.addBlockState(GRANITE_SLAB_1);
    Block.GRANITE_SLAB.addBlockState(GRANITE_SLAB_2);
    Block.GRANITE_SLAB.addBlockState(GRANITE_SLAB_3);
    Block.GRANITE_SLAB.addBlockState(GRANITE_SLAB_4);
    Block.GRANITE_SLAB.addBlockState(GRANITE_SLAB_5);
  }
}
