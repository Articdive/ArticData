package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Terracotta {
  public static final BlockState TERRACOTTA_0 = new BlockState((short) 7886, Block.TERRACOTTA);

  public static void initStates() {
    Block.TERRACOTTA.addBlockState(TERRACOTTA_0);
  }
}
