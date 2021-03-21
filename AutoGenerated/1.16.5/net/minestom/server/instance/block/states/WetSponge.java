package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WetSponge {
  public static final BlockState WET_SPONGE_0 = new BlockState((short) 230, Block.WET_SPONGE);

  public static void initStates() {
    Block.WET_SPONGE.addBlockState(WET_SPONGE_0);
  }
}
