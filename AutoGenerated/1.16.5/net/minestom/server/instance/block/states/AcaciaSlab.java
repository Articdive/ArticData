package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AcaciaSlab {
  public static final BlockState ACACIA_SLAB_0 = new BlockState((short) 8328, Block.ACACIA_SLAB);

  public static final BlockState ACACIA_SLAB_1 = new BlockState((short) 8329, Block.ACACIA_SLAB);

  public static final BlockState ACACIA_SLAB_2 = new BlockState((short) 8330, Block.ACACIA_SLAB);

  public static final BlockState ACACIA_SLAB_3 = new BlockState((short) 8331, Block.ACACIA_SLAB);

  public static final BlockState ACACIA_SLAB_4 = new BlockState((short) 8332, Block.ACACIA_SLAB);

  public static final BlockState ACACIA_SLAB_5 = new BlockState((short) 8333, Block.ACACIA_SLAB);

  public static void initStates() {
    Block.ACACIA_SLAB.addBlockState(ACACIA_SLAB_0);
    Block.ACACIA_SLAB.addBlockState(ACACIA_SLAB_1);
    Block.ACACIA_SLAB.addBlockState(ACACIA_SLAB_2);
    Block.ACACIA_SLAB.addBlockState(ACACIA_SLAB_3);
    Block.ACACIA_SLAB.addBlockState(ACACIA_SLAB_4);
    Block.ACACIA_SLAB.addBlockState(ACACIA_SLAB_5);
  }
}
