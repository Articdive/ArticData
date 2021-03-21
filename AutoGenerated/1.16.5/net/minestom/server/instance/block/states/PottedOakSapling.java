package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedOakSapling {
  public static final BlockState POTTED_OAK_SAPLING_0 = new BlockState((short) 6310, Block.POTTED_OAK_SAPLING);

  public static void initStates() {
    Block.POTTED_OAK_SAPLING.addBlockState(POTTED_OAK_SAPLING_0);
  }
}
