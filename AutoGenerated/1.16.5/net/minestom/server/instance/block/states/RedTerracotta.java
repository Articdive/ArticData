package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedTerracotta {
  public static final BlockState RED_TERRACOTTA_0 = new BlockState((short) 6865, Block.RED_TERRACOTTA);

  public static void initStates() {
    Block.RED_TERRACOTTA.addBlockState(RED_TERRACOTTA_0);
  }
}
