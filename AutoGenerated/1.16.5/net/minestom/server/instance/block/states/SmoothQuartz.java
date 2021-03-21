package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SmoothQuartz {
  public static final BlockState SMOOTH_QUARTZ_0 = new BlockState((short) 8420, Block.SMOOTH_QUARTZ);

  public static void initStates() {
    Block.SMOOTH_QUARTZ.addBlockState(SMOOTH_QUARTZ_0);
  }
}
