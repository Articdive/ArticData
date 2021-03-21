package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class NetherQuartzOre {
  public static final BlockState NETHER_QUARTZ_ORE_0 = new BlockState((short) 6731, Block.NETHER_QUARTZ_ORE);

  public static void initStates() {
    Block.NETHER_QUARTZ_ORE.addBlockState(NETHER_QUARTZ_ORE_0);
  }
}
