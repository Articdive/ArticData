package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SmoothRedSandstone {
  public static final BlockState SMOOTH_RED_SANDSTONE_0 = new BlockState((short) 8421, Block.SMOOTH_RED_SANDSTONE);

  public static void initStates() {
    Block.SMOOTH_RED_SANDSTONE.addBlockState(SMOOTH_RED_SANDSTONE_0);
  }
}
