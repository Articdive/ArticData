package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightBlueTerracotta {
  public static final BlockState LIGHT_BLUE_TERRACOTTA_0 = new BlockState((short) 6854, Block.LIGHT_BLUE_TERRACOTTA);

  public static void initStates() {
    Block.LIGHT_BLUE_TERRACOTTA.addBlockState(LIGHT_BLUE_TERRACOTTA_0);
  }
}
