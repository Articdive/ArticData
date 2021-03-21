package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class ChiseledQuartzBlock {
  public static final BlockState CHISELED_QUARTZ_BLOCK_0 = new BlockState((short) 6743, Block.CHISELED_QUARTZ_BLOCK);

  public static void initStates() {
    Block.CHISELED_QUARTZ_BLOCK.addBlockState(CHISELED_QUARTZ_BLOCK_0);
  }
}
