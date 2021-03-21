package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class JungleSlab {
  public static final BlockState JUNGLE_SLAB_0 = new BlockState((short) 8322, Block.JUNGLE_SLAB);

  public static final BlockState JUNGLE_SLAB_1 = new BlockState((short) 8323, Block.JUNGLE_SLAB);

  public static final BlockState JUNGLE_SLAB_2 = new BlockState((short) 8324, Block.JUNGLE_SLAB);

  public static final BlockState JUNGLE_SLAB_3 = new BlockState((short) 8325, Block.JUNGLE_SLAB);

  public static final BlockState JUNGLE_SLAB_4 = new BlockState((short) 8326, Block.JUNGLE_SLAB);

  public static final BlockState JUNGLE_SLAB_5 = new BlockState((short) 8327, Block.JUNGLE_SLAB);

  public static void initStates() {
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_0);
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_1);
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_2);
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_3);
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_4);
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_5);
  }
}
