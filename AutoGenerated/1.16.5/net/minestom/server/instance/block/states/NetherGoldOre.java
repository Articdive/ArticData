package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class NetherGoldOre {
  public static final BlockState NETHER_GOLD_ORE_0 = new BlockState((short) 72, Block.NETHER_GOLD_ORE);

  public static void initStates() {
    Block.NETHER_GOLD_ORE.addBlockState(NETHER_GOLD_ORE_0);
  }
}
