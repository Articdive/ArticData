package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class NetherSprouts {
  public static final BlockState NETHER_SPROUTS_0 = new BlockState((short) 14982, Block.NETHER_SPROUTS);

  public static void initStates() {
    Block.NETHER_SPROUTS.addBlockState(NETHER_SPROUTS_0);
  }
}
