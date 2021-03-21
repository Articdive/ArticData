package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedGranite {
  public static final BlockState POLISHED_GRANITE_0 = new BlockState((short) 3, Block.POLISHED_GRANITE);

  public static void initStates() {
    Block.POLISHED_GRANITE.addBlockState(POLISHED_GRANITE_0);
  }
}
