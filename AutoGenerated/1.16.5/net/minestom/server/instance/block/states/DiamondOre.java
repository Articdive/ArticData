package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DiamondOre {
  public static final BlockState DIAMOND_ORE_0 = new BlockState((short) 3354, Block.DIAMOND_ORE);

  public static void initStates() {
    Block.DIAMOND_ORE.addBlockState(DIAMOND_ORE_0);
  }
}
