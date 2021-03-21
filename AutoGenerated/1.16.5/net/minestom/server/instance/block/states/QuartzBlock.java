package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class QuartzBlock {
  public static final BlockState QUARTZ_BLOCK_0 = new BlockState((short) 6742, Block.QUARTZ_BLOCK);

  public static void initStates() {
    Block.QUARTZ_BLOCK.addBlockState(QUARTZ_BLOCK_0);
  }
}
