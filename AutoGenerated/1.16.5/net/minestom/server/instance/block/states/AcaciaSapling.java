package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AcaciaSapling {
  public static final BlockState ACACIA_SAPLING_0 = new BlockState((short) 29, Block.ACACIA_SAPLING);

  public static final BlockState ACACIA_SAPLING_1 = new BlockState((short) 30, Block.ACACIA_SAPLING);

  public static void initStates() {
    Block.ACACIA_SAPLING.addBlockState(ACACIA_SAPLING_0);
    Block.ACACIA_SAPLING.addBlockState(ACACIA_SAPLING_1);
  }
}
