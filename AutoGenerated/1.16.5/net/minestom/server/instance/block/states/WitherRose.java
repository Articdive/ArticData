package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WitherRose {
  public static final BlockState WITHER_ROSE_0 = new BlockState((short) 1423, Block.WITHER_ROSE);

  public static void initStates() {
    Block.WITHER_ROSE.addBlockState(WITHER_ROSE_0);
  }
}
