package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WarpedFungus {
  public static final BlockState WARPED_FUNGUS_0 = new BlockState((short) 14979, Block.WARPED_FUNGUS);

  public static void initStates() {
    Block.WARPED_FUNGUS.addBlockState(WARPED_FUNGUS_0);
  }
}
