package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightBlueWool {
  public static final BlockState LIGHT_BLUE_WOOL_0 = new BlockState((short) 1387, Block.LIGHT_BLUE_WOOL);

  public static void initStates() {
    Block.LIGHT_BLUE_WOOL.addBlockState(LIGHT_BLUE_WOOL_0);
  }
}
