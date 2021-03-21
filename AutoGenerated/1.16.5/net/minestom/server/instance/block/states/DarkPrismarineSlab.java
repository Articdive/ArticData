package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DarkPrismarineSlab {
  public static final BlockState DARK_PRISMARINE_SLAB_0 = new BlockState((short) 7860, Block.DARK_PRISMARINE_SLAB);

  public static final BlockState DARK_PRISMARINE_SLAB_1 = new BlockState((short) 7861, Block.DARK_PRISMARINE_SLAB);

  public static final BlockState DARK_PRISMARINE_SLAB_2 = new BlockState((short) 7862, Block.DARK_PRISMARINE_SLAB);

  public static final BlockState DARK_PRISMARINE_SLAB_3 = new BlockState((short) 7863, Block.DARK_PRISMARINE_SLAB);

  public static final BlockState DARK_PRISMARINE_SLAB_4 = new BlockState((short) 7864, Block.DARK_PRISMARINE_SLAB);

  public static final BlockState DARK_PRISMARINE_SLAB_5 = new BlockState((short) 7865, Block.DARK_PRISMARINE_SLAB);

  public static void initStates() {
    Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_0);
    Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_1);
    Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_2);
    Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_3);
    Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_4);
    Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_5);
  }
}
