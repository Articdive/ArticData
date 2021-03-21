package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class HoneycombBlock {
  public static final BlockState HONEYCOMB_BLOCK_0 = new BlockState((short) 15833, Block.HONEYCOMB_BLOCK);

  public static void initStates() {
    Block.HONEYCOMB_BLOCK.addBlockState(HONEYCOMB_BLOCK_0);
  }
}
