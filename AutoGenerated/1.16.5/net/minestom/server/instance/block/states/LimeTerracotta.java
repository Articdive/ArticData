package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LimeTerracotta {
  public static final BlockState LIME_TERRACOTTA_0 = new BlockState((short) 6856, Block.LIME_TERRACOTTA);

  public static void initStates() {
    Block.LIME_TERRACOTTA.addBlockState(LIME_TERRACOTTA_0);
  }
}
