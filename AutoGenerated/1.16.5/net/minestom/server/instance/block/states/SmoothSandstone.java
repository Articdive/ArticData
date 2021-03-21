package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SmoothSandstone {
  public static final BlockState SMOOTH_SANDSTONE_0 = new BlockState((short) 8419, Block.SMOOTH_SANDSTONE);

  public static void initStates() {
    Block.SMOOTH_SANDSTONE.addBlockState(SMOOTH_SANDSTONE_0);
  }
}
