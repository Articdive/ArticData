package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WhiteTerracotta {
  public static final BlockState WHITE_TERRACOTTA_0 = new BlockState((short) 6851, Block.WHITE_TERRACOTTA);

  public static void initStates() {
    Block.WHITE_TERRACOTTA.addBlockState(WHITE_TERRACOTTA_0);
  }
}
