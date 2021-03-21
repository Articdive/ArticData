package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class NetherBricks {
  public static final BlockState NETHER_BRICKS_0 = new BlockState((short) 5019, Block.NETHER_BRICKS);

  public static void initStates() {
    Block.NETHER_BRICKS.addBlockState(NETHER_BRICKS_0);
  }
}
