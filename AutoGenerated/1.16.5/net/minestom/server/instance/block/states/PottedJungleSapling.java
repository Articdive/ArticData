package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedJungleSapling {
  public static final BlockState POTTED_JUNGLE_SAPLING_0 = new BlockState((short) 6313, Block.POTTED_JUNGLE_SAPLING);

  public static void initStates() {
    Block.POTTED_JUNGLE_SAPLING.addBlockState(POTTED_JUNGLE_SAPLING_0);
  }
}
