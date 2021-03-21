package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownTerracotta {
  public static final BlockState BROWN_TERRACOTTA_0 = new BlockState((short) 6863, Block.BROWN_TERRACOTTA);

  public static void initStates() {
    Block.BROWN_TERRACOTTA.addBlockState(BROWN_TERRACOTTA_0);
  }
}
