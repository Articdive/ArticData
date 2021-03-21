package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedstoneBlock {
  public static final BlockState REDSTONE_BLOCK_0 = new BlockState((short) 6730, Block.REDSTONE_BLOCK);

  public static void initStates() {
    Block.REDSTONE_BLOCK.addBlockState(REDSTONE_BLOCK_0);
  }
}
