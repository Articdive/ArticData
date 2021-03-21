package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PrismarineBrickSlab {
  public static final BlockState PRISMARINE_BRICK_SLAB_0 = new BlockState((short) 7854, Block.PRISMARINE_BRICK_SLAB);

  public static final BlockState PRISMARINE_BRICK_SLAB_1 = new BlockState((short) 7855, Block.PRISMARINE_BRICK_SLAB);

  public static final BlockState PRISMARINE_BRICK_SLAB_2 = new BlockState((short) 7856, Block.PRISMARINE_BRICK_SLAB);

  public static final BlockState PRISMARINE_BRICK_SLAB_3 = new BlockState((short) 7857, Block.PRISMARINE_BRICK_SLAB);

  public static final BlockState PRISMARINE_BRICK_SLAB_4 = new BlockState((short) 7858, Block.PRISMARINE_BRICK_SLAB);

  public static final BlockState PRISMARINE_BRICK_SLAB_5 = new BlockState((short) 7859, Block.PRISMARINE_BRICK_SLAB);

  public static void initStates() {
    Block.PRISMARINE_BRICK_SLAB.addBlockState(PRISMARINE_BRICK_SLAB_0);
    Block.PRISMARINE_BRICK_SLAB.addBlockState(PRISMARINE_BRICK_SLAB_1);
    Block.PRISMARINE_BRICK_SLAB.addBlockState(PRISMARINE_BRICK_SLAB_2);
    Block.PRISMARINE_BRICK_SLAB.addBlockState(PRISMARINE_BRICK_SLAB_3);
    Block.PRISMARINE_BRICK_SLAB.addBlockState(PRISMARINE_BRICK_SLAB_4);
    Block.PRISMARINE_BRICK_SLAB.addBlockState(PRISMARINE_BRICK_SLAB_5);
  }
}
