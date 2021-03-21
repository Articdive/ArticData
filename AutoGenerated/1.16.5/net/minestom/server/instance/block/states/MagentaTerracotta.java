package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MagentaTerracotta {
  public static final BlockState MAGENTA_TERRACOTTA_0 = new BlockState((short) 6853, Block.MAGENTA_TERRACOTTA);

  public static void initStates() {
    Block.MAGENTA_TERRACOTTA.addBlockState(MAGENTA_TERRACOTTA_0);
  }
}
