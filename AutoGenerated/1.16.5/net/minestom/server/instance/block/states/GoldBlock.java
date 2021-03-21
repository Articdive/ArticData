package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GoldBlock {
  public static final BlockState GOLD_BLOCK_0 = new BlockState((short) 1427, Block.GOLD_BLOCK);

  public static void initStates() {
    Block.GOLD_BLOCK.addBlockState(GOLD_BLOCK_0);
  }
}
