package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrickSlab {
  public static final BlockState BRICK_SLAB_0 = new BlockState((short) 8376, Block.BRICK_SLAB);

  public static final BlockState BRICK_SLAB_1 = new BlockState((short) 8377, Block.BRICK_SLAB);

  public static final BlockState BRICK_SLAB_2 = new BlockState((short) 8378, Block.BRICK_SLAB);

  public static final BlockState BRICK_SLAB_3 = new BlockState((short) 8379, Block.BRICK_SLAB);

  public static final BlockState BRICK_SLAB_4 = new BlockState((short) 8380, Block.BRICK_SLAB);

  public static final BlockState BRICK_SLAB_5 = new BlockState((short) 8381, Block.BRICK_SLAB);

  public static void initStates() {
    Block.BRICK_SLAB.addBlockState(BRICK_SLAB_0);
    Block.BRICK_SLAB.addBlockState(BRICK_SLAB_1);
    Block.BRICK_SLAB.addBlockState(BRICK_SLAB_2);
    Block.BRICK_SLAB.addBlockState(BRICK_SLAB_3);
    Block.BRICK_SLAB.addBlockState(BRICK_SLAB_4);
    Block.BRICK_SLAB.addBlockState(BRICK_SLAB_5);
  }
}
