package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedNetherBrickSlab {
  public static final BlockState RED_NETHER_BRICK_SLAB_0 = new BlockState((short) 10853, Block.RED_NETHER_BRICK_SLAB);

  public static final BlockState RED_NETHER_BRICK_SLAB_1 = new BlockState((short) 10854, Block.RED_NETHER_BRICK_SLAB);

  public static final BlockState RED_NETHER_BRICK_SLAB_2 = new BlockState((short) 10855, Block.RED_NETHER_BRICK_SLAB);

  public static final BlockState RED_NETHER_BRICK_SLAB_3 = new BlockState((short) 10856, Block.RED_NETHER_BRICK_SLAB);

  public static final BlockState RED_NETHER_BRICK_SLAB_4 = new BlockState((short) 10857, Block.RED_NETHER_BRICK_SLAB);

  public static final BlockState RED_NETHER_BRICK_SLAB_5 = new BlockState((short) 10858, Block.RED_NETHER_BRICK_SLAB);

  public static void initStates() {
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_0);
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_1);
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_2);
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_3);
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_4);
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_5);
  }
}
