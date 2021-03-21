package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MossyStoneBrickSlab {
  public static final BlockState MOSSY_STONE_BRICK_SLAB_0 = new BlockState((short) 10805, Block.MOSSY_STONE_BRICK_SLAB);

  public static final BlockState MOSSY_STONE_BRICK_SLAB_1 = new BlockState((short) 10806, Block.MOSSY_STONE_BRICK_SLAB);

  public static final BlockState MOSSY_STONE_BRICK_SLAB_2 = new BlockState((short) 10807, Block.MOSSY_STONE_BRICK_SLAB);

  public static final BlockState MOSSY_STONE_BRICK_SLAB_3 = new BlockState((short) 10808, Block.MOSSY_STONE_BRICK_SLAB);

  public static final BlockState MOSSY_STONE_BRICK_SLAB_4 = new BlockState((short) 10809, Block.MOSSY_STONE_BRICK_SLAB);

  public static final BlockState MOSSY_STONE_BRICK_SLAB_5 = new BlockState((short) 10810, Block.MOSSY_STONE_BRICK_SLAB);

  public static void initStates() {
    Block.MOSSY_STONE_BRICK_SLAB.addBlockState(MOSSY_STONE_BRICK_SLAB_0);
    Block.MOSSY_STONE_BRICK_SLAB.addBlockState(MOSSY_STONE_BRICK_SLAB_1);
    Block.MOSSY_STONE_BRICK_SLAB.addBlockState(MOSSY_STONE_BRICK_SLAB_2);
    Block.MOSSY_STONE_BRICK_SLAB.addBlockState(MOSSY_STONE_BRICK_SLAB_3);
    Block.MOSSY_STONE_BRICK_SLAB.addBlockState(MOSSY_STONE_BRICK_SLAB_4);
    Block.MOSSY_STONE_BRICK_SLAB.addBlockState(MOSSY_STONE_BRICK_SLAB_5);
  }
}
