package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlueOrchid {
  public static final BlockState BLUE_ORCHID_0 = new BlockState((short) 1414, Block.BLUE_ORCHID);

  public static void initStates() {
    Block.BLUE_ORCHID.addBlockState(BLUE_ORCHID_0);
  }
}
