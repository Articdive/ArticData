package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LapisBlock {
  public static final BlockState LAPIS_BLOCK_0 = new BlockState((short) 233, Block.LAPIS_BLOCK);

  public static void initStates() {
    Block.LAPIS_BLOCK.addBlockState(LAPIS_BLOCK_0);
  }
}
