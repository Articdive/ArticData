package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class YellowWool {
  public static final BlockState YELLOW_WOOL_0 = new BlockState((short) 1388, Block.YELLOW_WOOL);

  public static void initStates() {
    Block.YELLOW_WOOL.addBlockState(YELLOW_WOOL_0);
  }
}
