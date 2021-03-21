package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DriedKelpBlock {
  public static final BlockState DRIED_KELP_BLOCK_0 = new BlockState((short) 9501, Block.DRIED_KELP_BLOCK);

  public static void initStates() {
    Block.DRIED_KELP_BLOCK.addBlockState(DRIED_KELP_BLOCK_0);
  }
}
