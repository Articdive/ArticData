package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EndStoneBrickSlab {
  public static final BlockState END_STONE_BRICK_SLAB_0 = new BlockState((short) 10823, Block.END_STONE_BRICK_SLAB);

  public static final BlockState END_STONE_BRICK_SLAB_1 = new BlockState((short) 10824, Block.END_STONE_BRICK_SLAB);

  public static final BlockState END_STONE_BRICK_SLAB_2 = new BlockState((short) 10825, Block.END_STONE_BRICK_SLAB);

  public static final BlockState END_STONE_BRICK_SLAB_3 = new BlockState((short) 10826, Block.END_STONE_BRICK_SLAB);

  public static final BlockState END_STONE_BRICK_SLAB_4 = new BlockState((short) 10827, Block.END_STONE_BRICK_SLAB);

  public static final BlockState END_STONE_BRICK_SLAB_5 = new BlockState((short) 10828, Block.END_STONE_BRICK_SLAB);

  public static void initStates() {
    Block.END_STONE_BRICK_SLAB.addBlockState(END_STONE_BRICK_SLAB_0);
    Block.END_STONE_BRICK_SLAB.addBlockState(END_STONE_BRICK_SLAB_1);
    Block.END_STONE_BRICK_SLAB.addBlockState(END_STONE_BRICK_SLAB_2);
    Block.END_STONE_BRICK_SLAB.addBlockState(END_STONE_BRICK_SLAB_3);
    Block.END_STONE_BRICK_SLAB.addBlockState(END_STONE_BRICK_SLAB_4);
    Block.END_STONE_BRICK_SLAB.addBlockState(END_STONE_BRICK_SLAB_5);
  }
}
