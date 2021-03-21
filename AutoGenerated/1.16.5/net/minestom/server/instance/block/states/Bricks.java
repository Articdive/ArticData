package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Bricks {
  public static final BlockState BRICKS_0 = new BlockState((short) 1429, Block.BRICKS);

  public static void initStates() {
    Block.BRICKS.addBlockState(BRICKS_0);
  }
}
