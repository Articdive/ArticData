package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EndStoneBricks {
  public static final BlockState END_STONE_BRICKS_0 = new BlockState((short) 9222, Block.END_STONE_BRICKS);

  public static void initStates() {
    Block.END_STONE_BRICKS.addBlockState(END_STONE_BRICKS_0);
  }
}
