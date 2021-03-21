package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrayWool {
  public static final BlockState GRAY_WOOL_0 = new BlockState((short) 1391, Block.GRAY_WOOL);

  public static void initStates() {
    Block.GRAY_WOOL.addBlockState(GRAY_WOOL_0);
  }
}
