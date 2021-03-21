package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class IronBlock {
  public static final BlockState IRON_BLOCK_0 = new BlockState((short) 1428, Block.IRON_BLOCK);

  public static void initStates() {
    Block.IRON_BLOCK.addBlockState(IRON_BLOCK_0);
  }
}
