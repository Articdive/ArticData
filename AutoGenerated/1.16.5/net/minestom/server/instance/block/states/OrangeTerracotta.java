package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OrangeTerracotta {
  public static final BlockState ORANGE_TERRACOTTA_0 = new BlockState((short) 6852, Block.ORANGE_TERRACOTTA);

  public static void initStates() {
    Block.ORANGE_TERRACOTTA.addBlockState(ORANGE_TERRACOTTA_0);
  }
}
