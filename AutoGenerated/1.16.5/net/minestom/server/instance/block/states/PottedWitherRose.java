package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedWitherRose {
  public static final BlockState POTTED_WITHER_ROSE_0 = new BlockState((short) 6329, Block.POTTED_WITHER_ROSE);

  public static void initStates() {
    Block.POTTED_WITHER_ROSE.addBlockState(POTTED_WITHER_ROSE_0);
  }
}
