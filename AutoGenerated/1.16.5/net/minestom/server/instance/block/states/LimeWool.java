package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LimeWool {
  public static final BlockState LIME_WOOL_0 = new BlockState((short) 1389, Block.LIME_WOOL);

  public static void initStates() {
    Block.LIME_WOOL.addBlockState(LIME_WOOL_0);
  }
}
