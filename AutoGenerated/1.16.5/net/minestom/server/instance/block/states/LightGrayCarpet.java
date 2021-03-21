package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightGrayCarpet {
  public static final BlockState LIGHT_GRAY_CARPET_0 = new BlockState((short) 7878, Block.LIGHT_GRAY_CARPET);

  public static void initStates() {
    Block.LIGHT_GRAY_CARPET.addBlockState(LIGHT_GRAY_CARPET_0);
  }
}
