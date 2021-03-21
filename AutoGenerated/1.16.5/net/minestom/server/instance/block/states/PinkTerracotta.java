package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PinkTerracotta {
  public static final BlockState PINK_TERRACOTTA_0 = new BlockState((short) 6857, Block.PINK_TERRACOTTA);

  public static void initStates() {
    Block.PINK_TERRACOTTA.addBlockState(PINK_TERRACOTTA_0);
  }
}
