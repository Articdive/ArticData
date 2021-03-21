package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class QuartzBricks {
  public static final BlockState QUARTZ_BRICKS_0 = new BlockState((short) 17111, Block.QUARTZ_BRICKS);

  public static void initStates() {
    Block.QUARTZ_BRICKS.addBlockState(QUARTZ_BRICKS_0);
  }
}
