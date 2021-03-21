package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CoarseDirt {
  public static final BlockState COARSE_DIRT_0 = new BlockState((short) 11, Block.COARSE_DIRT);

  public static void initStates() {
    Block.COARSE_DIRT.addBlockState(COARSE_DIRT_0);
  }
}
