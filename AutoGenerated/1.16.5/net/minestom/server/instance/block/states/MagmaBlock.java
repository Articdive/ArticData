package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MagmaBlock {
  public static final BlockState MAGMA_BLOCK_0 = new BlockState((short) 9257, Block.MAGMA_BLOCK);

  public static void initStates() {
    Block.MAGMA_BLOCK.addBlockState(MAGMA_BLOCK_0);
  }
}
