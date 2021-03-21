package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class NetherBrickSlab {
  public static final BlockState NETHER_BRICK_SLAB_0 = new BlockState((short) 8388, Block.NETHER_BRICK_SLAB);

  public static final BlockState NETHER_BRICK_SLAB_1 = new BlockState((short) 8389, Block.NETHER_BRICK_SLAB);

  public static final BlockState NETHER_BRICK_SLAB_2 = new BlockState((short) 8390, Block.NETHER_BRICK_SLAB);

  public static final BlockState NETHER_BRICK_SLAB_3 = new BlockState((short) 8391, Block.NETHER_BRICK_SLAB);

  public static final BlockState NETHER_BRICK_SLAB_4 = new BlockState((short) 8392, Block.NETHER_BRICK_SLAB);

  public static final BlockState NETHER_BRICK_SLAB_5 = new BlockState((short) 8393, Block.NETHER_BRICK_SLAB);

  public static void initStates() {
    Block.NETHER_BRICK_SLAB.addBlockState(NETHER_BRICK_SLAB_0);
    Block.NETHER_BRICK_SLAB.addBlockState(NETHER_BRICK_SLAB_1);
    Block.NETHER_BRICK_SLAB.addBlockState(NETHER_BRICK_SLAB_2);
    Block.NETHER_BRICK_SLAB.addBlockState(NETHER_BRICK_SLAB_3);
    Block.NETHER_BRICK_SLAB.addBlockState(NETHER_BRICK_SLAB_4);
    Block.NETHER_BRICK_SLAB.addBlockState(NETHER_BRICK_SLAB_5);
  }
}
