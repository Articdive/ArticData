package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PrismarineSlab {
  public static final BlockState PRISMARINE_SLAB_0 = new BlockState((short) 7848, Block.PRISMARINE_SLAB);

  public static final BlockState PRISMARINE_SLAB_1 = new BlockState((short) 7849, Block.PRISMARINE_SLAB);

  public static final BlockState PRISMARINE_SLAB_2 = new BlockState((short) 7850, Block.PRISMARINE_SLAB);

  public static final BlockState PRISMARINE_SLAB_3 = new BlockState((short) 7851, Block.PRISMARINE_SLAB);

  public static final BlockState PRISMARINE_SLAB_4 = new BlockState((short) 7852, Block.PRISMARINE_SLAB);

  public static final BlockState PRISMARINE_SLAB_5 = new BlockState((short) 7853, Block.PRISMARINE_SLAB);

  public static void initStates() {
    Block.PRISMARINE_SLAB.addBlockState(PRISMARINE_SLAB_0);
    Block.PRISMARINE_SLAB.addBlockState(PRISMARINE_SLAB_1);
    Block.PRISMARINE_SLAB.addBlockState(PRISMARINE_SLAB_2);
    Block.PRISMARINE_SLAB.addBlockState(PRISMARINE_SLAB_3);
    Block.PRISMARINE_SLAB.addBlockState(PRISMARINE_SLAB_4);
    Block.PRISMARINE_SLAB.addBlockState(PRISMARINE_SLAB_5);
  }
}
