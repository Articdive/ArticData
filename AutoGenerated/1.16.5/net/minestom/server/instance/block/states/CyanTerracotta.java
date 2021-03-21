package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CyanTerracotta {
  public static final BlockState CYAN_TERRACOTTA_0 = new BlockState((short) 6860, Block.CYAN_TERRACOTTA);

  public static void initStates() {
    Block.CYAN_TERRACOTTA.addBlockState(CYAN_TERRACOTTA_0);
  }
}
