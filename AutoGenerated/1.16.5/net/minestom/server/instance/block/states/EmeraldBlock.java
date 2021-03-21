package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EmeraldBlock {
  public static final BlockState EMERALD_BLOCK_0 = new BlockState((short) 5407, Block.EMERALD_BLOCK);

  public static void initStates() {
    Block.EMERALD_BLOCK.addBlockState(EMERALD_BLOCK_0);
  }
}
