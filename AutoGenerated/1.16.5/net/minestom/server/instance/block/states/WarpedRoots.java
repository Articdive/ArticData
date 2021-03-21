package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WarpedRoots {
  public static final BlockState WARPED_ROOTS_0 = new BlockState((short) 14981, Block.WARPED_ROOTS);

  public static void initStates() {
    Block.WARPED_ROOTS.addBlockState(WARPED_ROOTS_0);
  }
}
