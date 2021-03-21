package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Seagrass {
  public static final BlockState SEAGRASS_0 = new BlockState((short) 1345, Block.SEAGRASS);

  public static void initStates() {
    Block.SEAGRASS.addBlockState(SEAGRASS_0);
  }
}
