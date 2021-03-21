package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MossyStoneBricks {
  public static final BlockState MOSSY_STONE_BRICKS_0 = new BlockState((short) 4496, Block.MOSSY_STONE_BRICKS);

  public static void initStates() {
    Block.MOSSY_STONE_BRICKS.addBlockState(MOSSY_STONE_BRICKS_0);
  }
}
