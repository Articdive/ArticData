package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DiamondBlock {
  public static final BlockState DIAMOND_BLOCK_0 = new BlockState((short) 3355, Block.DIAMOND_BLOCK);

  public static void initStates() {
    Block.DIAMOND_BLOCK.addBlockState(DIAMOND_BLOCK_0);
  }
}
