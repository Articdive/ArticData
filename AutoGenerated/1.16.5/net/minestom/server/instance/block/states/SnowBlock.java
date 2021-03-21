package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SnowBlock {
  public static final BlockState SNOW_BLOCK_0 = new BlockState((short) 3930, Block.SNOW_BLOCK);

  public static void initStates() {
    Block.SNOW_BLOCK.addBlockState(SNOW_BLOCK_0);
  }
}
