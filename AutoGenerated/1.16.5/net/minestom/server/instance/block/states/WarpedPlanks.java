package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WarpedPlanks {
  public static final BlockState WARPED_PLANKS_0 = new BlockState((short) 15054, Block.WARPED_PLANKS);

  public static void initStates() {
    Block.WARPED_PLANKS.addBlockState(WARPED_PLANKS_0);
  }
}
