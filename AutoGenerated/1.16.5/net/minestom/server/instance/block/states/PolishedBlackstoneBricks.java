package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedBlackstoneBricks {
  public static final BlockState POLISHED_BLACKSTONE_BRICKS_0 = new BlockState((short) 16259, Block.POLISHED_BLACKSTONE_BRICKS);

  public static void initStates() {
    Block.POLISHED_BLACKSTONE_BRICKS.addBlockState(POLISHED_BLACKSTONE_BRICKS_0);
  }
}
