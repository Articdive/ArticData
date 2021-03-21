package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownWool {
  public static final BlockState BROWN_WOOL_0 = new BlockState((short) 1396, Block.BROWN_WOOL);

  public static void initStates() {
    Block.BROWN_WOOL.addBlockState(BROWN_WOOL_0);
  }
}
