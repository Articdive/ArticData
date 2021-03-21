package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedBirchSapling {
  public static final BlockState POTTED_BIRCH_SAPLING_0 = new BlockState((short) 6312, Block.POTTED_BIRCH_SAPLING);

  public static void initStates() {
    Block.POTTED_BIRCH_SAPLING.addBlockState(POTTED_BIRCH_SAPLING_0);
  }
}
