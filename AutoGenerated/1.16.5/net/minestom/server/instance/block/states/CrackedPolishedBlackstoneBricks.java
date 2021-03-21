package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrackedPolishedBlackstoneBricks {
  public static final BlockState CRACKED_POLISHED_BLACKSTONE_BRICKS_0 = new BlockState((short) 16260, Block.CRACKED_POLISHED_BLACKSTONE_BRICKS);

  public static void initStates() {
    Block.CRACKED_POLISHED_BLACKSTONE_BRICKS.addBlockState(CRACKED_POLISHED_BLACKSTONE_BRICKS_0);
  }
}
