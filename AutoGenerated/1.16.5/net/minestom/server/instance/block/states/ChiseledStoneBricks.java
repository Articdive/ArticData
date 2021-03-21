package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class ChiseledStoneBricks {
  public static final BlockState CHISELED_STONE_BRICKS_0 = new BlockState((short) 4498, Block.CHISELED_STONE_BRICKS);

  public static void initStates() {
    Block.CHISELED_STONE_BRICKS.addBlockState(CHISELED_STONE_BRICKS_0);
  }
}
