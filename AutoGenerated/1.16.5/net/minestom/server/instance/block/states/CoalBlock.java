package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CoalBlock {
  public static final BlockState COAL_BLOCK_0 = new BlockState((short) 7887, Block.COAL_BLOCK);

  public static void initStates() {
    Block.COAL_BLOCK.addBlockState(COAL_BLOCK_0);
  }
}
