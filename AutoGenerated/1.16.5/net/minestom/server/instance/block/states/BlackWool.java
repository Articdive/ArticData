package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlackWool {
  public static final BlockState BLACK_WOOL_0 = new BlockState((short) 1399, Block.BLACK_WOOL);

  public static void initStates() {
    Block.BLACK_WOOL.addBlockState(BLACK_WOOL_0);
  }
}
