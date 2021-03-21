package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedWarpedRoots {
  public static final BlockState POTTED_WARPED_ROOTS_0 = new BlockState((short) 15845, Block.POTTED_WARPED_ROOTS);

  public static void initStates() {
    Block.POTTED_WARPED_ROOTS.addBlockState(POTTED_WARPED_ROOTS_0);
  }
}
