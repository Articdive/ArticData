package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedAcaciaSapling {
  public static final BlockState POTTED_ACACIA_SAPLING_0 = new BlockState((short) 6314, Block.POTTED_ACACIA_SAPLING);

  public static void initStates() {
    Block.POTTED_ACACIA_SAPLING.addBlockState(POTTED_ACACIA_SAPLING_0);
  }
}
