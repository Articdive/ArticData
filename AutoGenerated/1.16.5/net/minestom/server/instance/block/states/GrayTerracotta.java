package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrayTerracotta {
  public static final BlockState GRAY_TERRACOTTA_0 = new BlockState((short) 6858, Block.GRAY_TERRACOTTA);

  public static void initStates() {
    Block.GRAY_TERRACOTTA.addBlockState(GRAY_TERRACOTTA_0);
  }
}
