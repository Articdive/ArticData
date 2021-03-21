package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WarpedWartBlock {
  public static final BlockState WARPED_WART_BLOCK_0 = new BlockState((short) 14980, Block.WARPED_WART_BLOCK);

  public static void initStates() {
    Block.WARPED_WART_BLOCK.addBlockState(WARPED_WART_BLOCK_0);
  }
}
