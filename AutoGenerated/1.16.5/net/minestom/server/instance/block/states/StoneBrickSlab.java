package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StoneBrickSlab {
  public static final BlockState STONE_BRICK_SLAB_0 = new BlockState((short) 8382, Block.STONE_BRICK_SLAB);

  public static final BlockState STONE_BRICK_SLAB_1 = new BlockState((short) 8383, Block.STONE_BRICK_SLAB);

  public static final BlockState STONE_BRICK_SLAB_2 = new BlockState((short) 8384, Block.STONE_BRICK_SLAB);

  public static final BlockState STONE_BRICK_SLAB_3 = new BlockState((short) 8385, Block.STONE_BRICK_SLAB);

  public static final BlockState STONE_BRICK_SLAB_4 = new BlockState((short) 8386, Block.STONE_BRICK_SLAB);

  public static final BlockState STONE_BRICK_SLAB_5 = new BlockState((short) 8387, Block.STONE_BRICK_SLAB);

  public static void initStates() {
    Block.STONE_BRICK_SLAB.addBlockState(STONE_BRICK_SLAB_0);
    Block.STONE_BRICK_SLAB.addBlockState(STONE_BRICK_SLAB_1);
    Block.STONE_BRICK_SLAB.addBlockState(STONE_BRICK_SLAB_2);
    Block.STONE_BRICK_SLAB.addBlockState(STONE_BRICK_SLAB_3);
    Block.STONE_BRICK_SLAB.addBlockState(STONE_BRICK_SLAB_4);
    Block.STONE_BRICK_SLAB.addBlockState(STONE_BRICK_SLAB_5);
  }
}
