package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedAndesiteSlab {
  public static final BlockState POLISHED_ANDESITE_SLAB_0 = new BlockState((short) 10859, Block.POLISHED_ANDESITE_SLAB);

  public static final BlockState POLISHED_ANDESITE_SLAB_1 = new BlockState((short) 10860, Block.POLISHED_ANDESITE_SLAB);

  public static final BlockState POLISHED_ANDESITE_SLAB_2 = new BlockState((short) 10861, Block.POLISHED_ANDESITE_SLAB);

  public static final BlockState POLISHED_ANDESITE_SLAB_3 = new BlockState((short) 10862, Block.POLISHED_ANDESITE_SLAB);

  public static final BlockState POLISHED_ANDESITE_SLAB_4 = new BlockState((short) 10863, Block.POLISHED_ANDESITE_SLAB);

  public static final BlockState POLISHED_ANDESITE_SLAB_5 = new BlockState((short) 10864, Block.POLISHED_ANDESITE_SLAB);

  public static void initStates() {
    Block.POLISHED_ANDESITE_SLAB.addBlockState(POLISHED_ANDESITE_SLAB_0);
    Block.POLISHED_ANDESITE_SLAB.addBlockState(POLISHED_ANDESITE_SLAB_1);
    Block.POLISHED_ANDESITE_SLAB.addBlockState(POLISHED_ANDESITE_SLAB_2);
    Block.POLISHED_ANDESITE_SLAB.addBlockState(POLISHED_ANDESITE_SLAB_3);
    Block.POLISHED_ANDESITE_SLAB.addBlockState(POLISHED_ANDESITE_SLAB_4);
    Block.POLISHED_ANDESITE_SLAB.addBlockState(POLISHED_ANDESITE_SLAB_5);
  }
}
