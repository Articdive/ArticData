package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrackedStoneBricks {
  public static final BlockState CRACKED_STONE_BRICKS_0 = new BlockState((short) 4497, Block.CRACKED_STONE_BRICKS);

  public static void initStates() {
    Block.CRACKED_STONE_BRICKS.addBlockState(CRACKED_STONE_BRICKS_0);
  }
}
