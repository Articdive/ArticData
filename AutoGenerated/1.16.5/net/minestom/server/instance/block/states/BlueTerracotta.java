package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlueTerracotta {
  public static final BlockState BLUE_TERRACOTTA_0 = new BlockState((short) 6862, Block.BLUE_TERRACOTTA);

  public static void initStates() {
    Block.BLUE_TERRACOTTA.addBlockState(BLUE_TERRACOTTA_0);
  }
}
