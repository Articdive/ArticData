package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StoneBricks {
  public static final BlockState STONE_BRICKS_0 = new BlockState((short) 4495, Block.STONE_BRICKS);

  public static void initStates() {
    Block.STONE_BRICKS.addBlockState(STONE_BRICKS_0);
  }
}
