package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class HoneyBlock {
  public static final BlockState HONEY_BLOCK_0 = new BlockState((short) 15832, Block.HONEY_BLOCK);

  public static void initStates() {
    Block.HONEY_BLOCK.addBlockState(HONEY_BLOCK_0);
  }
}
