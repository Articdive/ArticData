package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AndesiteSlab {
  public static final BlockState ANDESITE_SLAB_0 = new BlockState((short) 10847, Block.ANDESITE_SLAB);

  public static final BlockState ANDESITE_SLAB_1 = new BlockState((short) 10848, Block.ANDESITE_SLAB);

  public static final BlockState ANDESITE_SLAB_2 = new BlockState((short) 10849, Block.ANDESITE_SLAB);

  public static final BlockState ANDESITE_SLAB_3 = new BlockState((short) 10850, Block.ANDESITE_SLAB);

  public static final BlockState ANDESITE_SLAB_4 = new BlockState((short) 10851, Block.ANDESITE_SLAB);

  public static final BlockState ANDESITE_SLAB_5 = new BlockState((short) 10852, Block.ANDESITE_SLAB);

  public static void initStates() {
    Block.ANDESITE_SLAB.addBlockState(ANDESITE_SLAB_0);
    Block.ANDESITE_SLAB.addBlockState(ANDESITE_SLAB_1);
    Block.ANDESITE_SLAB.addBlockState(ANDESITE_SLAB_2);
    Block.ANDESITE_SLAB.addBlockState(ANDESITE_SLAB_3);
    Block.ANDESITE_SLAB.addBlockState(ANDESITE_SLAB_4);
    Block.ANDESITE_SLAB.addBlockState(ANDESITE_SLAB_5);
  }
}
