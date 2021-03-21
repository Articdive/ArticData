package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WarpedNylium {
  public static final BlockState WARPED_NYLIUM_0 = new BlockState((short) 14978, Block.WARPED_NYLIUM);

  public static void initStates() {
    Block.WARPED_NYLIUM.addBlockState(WARPED_NYLIUM_0);
  }
}
