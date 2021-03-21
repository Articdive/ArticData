package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class NetherWartBlock {
  public static final BlockState NETHER_WART_BLOCK_0 = new BlockState((short) 9258, Block.NETHER_WART_BLOCK);

  public static void initStates() {
    Block.NETHER_WART_BLOCK.addBlockState(NETHER_WART_BLOCK_0);
  }
}
