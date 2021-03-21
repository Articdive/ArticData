package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class ChiseledNetherBricks {
  public static final BlockState CHISELED_NETHER_BRICKS_0 = new BlockState((short) 17109, Block.CHISELED_NETHER_BRICKS);

  public static void initStates() {
    Block.CHISELED_NETHER_BRICKS.addBlockState(CHISELED_NETHER_BRICKS_0);
  }
}
