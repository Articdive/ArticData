package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedWarpedFungus {
  public static final BlockState POTTED_WARPED_FUNGUS_0 = new BlockState((short) 15843, Block.POTTED_WARPED_FUNGUS);

  public static void initStates() {
    Block.POTTED_WARPED_FUNGUS.addBlockState(POTTED_WARPED_FUNGUS_0);
  }
}
