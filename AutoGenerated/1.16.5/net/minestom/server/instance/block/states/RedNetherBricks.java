package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedNetherBricks {
  public static final BlockState RED_NETHER_BRICKS_0 = new BlockState((short) 9259, Block.RED_NETHER_BRICKS);

  public static void initStates() {
    Block.RED_NETHER_BRICKS.addBlockState(RED_NETHER_BRICKS_0);
  }
}
