package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlackTerracotta {
  public static final BlockState BLACK_TERRACOTTA_0 = new BlockState((short) 6866, Block.BLACK_TERRACOTTA);

  public static void initStates() {
    Block.BLACK_TERRACOTTA.addBlockState(BLACK_TERRACOTTA_0);
  }
}
