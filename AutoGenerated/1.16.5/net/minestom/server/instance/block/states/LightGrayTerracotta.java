package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightGrayTerracotta {
  public static final BlockState LIGHT_GRAY_TERRACOTTA_0 = new BlockState((short) 6859, Block.LIGHT_GRAY_TERRACOTTA);

  public static void initStates() {
    Block.LIGHT_GRAY_TERRACOTTA.addBlockState(LIGHT_GRAY_TERRACOTTA_0);
  }
}
