package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpleTerracotta {
  public static final BlockState PURPLE_TERRACOTTA_0 = new BlockState((short) 6861, Block.PURPLE_TERRACOTTA);

  public static void initStates() {
    Block.PURPLE_TERRACOTTA.addBlockState(PURPLE_TERRACOTTA_0);
  }
}
