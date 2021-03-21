package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StoneSlab {
  public static final BlockState STONE_SLAB_0 = new BlockState((short) 8340, Block.STONE_SLAB);

  public static final BlockState STONE_SLAB_1 = new BlockState((short) 8341, Block.STONE_SLAB);

  public static final BlockState STONE_SLAB_2 = new BlockState((short) 8342, Block.STONE_SLAB);

  public static final BlockState STONE_SLAB_3 = new BlockState((short) 8343, Block.STONE_SLAB);

  public static final BlockState STONE_SLAB_4 = new BlockState((short) 8344, Block.STONE_SLAB);

  public static final BlockState STONE_SLAB_5 = new BlockState((short) 8345, Block.STONE_SLAB);

  public static void initStates() {
    Block.STONE_SLAB.addBlockState(STONE_SLAB_0);
    Block.STONE_SLAB.addBlockState(STONE_SLAB_1);
    Block.STONE_SLAB.addBlockState(STONE_SLAB_2);
    Block.STONE_SLAB.addBlockState(STONE_SLAB_3);
    Block.STONE_SLAB.addBlockState(STONE_SLAB_4);
    Block.STONE_SLAB.addBlockState(STONE_SLAB_5);
  }
}
