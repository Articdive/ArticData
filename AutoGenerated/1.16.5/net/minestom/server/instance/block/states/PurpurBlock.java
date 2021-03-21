package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpurBlock {
  public static final BlockState PURPUR_BLOCK_0 = new BlockState((short) 9138, Block.PURPUR_BLOCK);

  public static void initStates() {
    Block.PURPUR_BLOCK.addBlockState(PURPUR_BLOCK_0);
  }
}
