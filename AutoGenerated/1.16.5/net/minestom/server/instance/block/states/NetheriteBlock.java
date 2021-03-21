package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class NetheriteBlock {
  public static final BlockState NETHERITE_BLOCK_0 = new BlockState((short) 15834, Block.NETHERITE_BLOCK);

  public static void initStates() {
    Block.NETHERITE_BLOCK.addBlockState(NETHERITE_BLOCK_0);
  }
}
