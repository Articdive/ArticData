package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class InfestedStoneBricks {
  public static final BlockState INFESTED_STONE_BRICKS_0 = new BlockState((short) 4501, Block.INFESTED_STONE_BRICKS);

  public static void initStates() {
    Block.INFESTED_STONE_BRICKS.addBlockState(INFESTED_STONE_BRICKS_0);
  }
}
