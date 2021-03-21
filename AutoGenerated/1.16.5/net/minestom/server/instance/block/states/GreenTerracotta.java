package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GreenTerracotta {
  public static final BlockState GREEN_TERRACOTTA_0 = new BlockState((short) 6864, Block.GREEN_TERRACOTTA);

  public static void initStates() {
    Block.GREEN_TERRACOTTA.addBlockState(GREEN_TERRACOTTA_0);
  }
}
