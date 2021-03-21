package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightGrayWool {
  public static final BlockState LIGHT_GRAY_WOOL_0 = new BlockState((short) 1392, Block.LIGHT_GRAY_WOOL);

  public static void initStates() {
    Block.LIGHT_GRAY_WOOL.addBlockState(LIGHT_GRAY_WOOL_0);
  }
}
