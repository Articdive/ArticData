package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightBlueCarpet {
  public static final BlockState LIGHT_BLUE_CARPET_0 = new BlockState((short) 7873, Block.LIGHT_BLUE_CARPET);

  public static void initStates() {
    Block.LIGHT_BLUE_CARPET.addBlockState(LIGHT_BLUE_CARPET_0);
  }
}
