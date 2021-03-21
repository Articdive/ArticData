package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class YellowTerracotta {
  public static final BlockState YELLOW_TERRACOTTA_0 = new BlockState((short) 6855, Block.YELLOW_TERRACOTTA);

  public static void initStates() {
    Block.YELLOW_TERRACOTTA.addBlockState(YELLOW_TERRACOTTA_0);
  }
}
