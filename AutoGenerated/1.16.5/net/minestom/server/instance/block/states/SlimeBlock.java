package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SlimeBlock {
  public static final BlockState SLIME_BLOCK_0 = new BlockState((short) 7539, Block.SLIME_BLOCK);

  public static void initStates() {
    Block.SLIME_BLOCK.addBlockState(SLIME_BLOCK_0);
  }
}
