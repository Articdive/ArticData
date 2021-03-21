package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CoalOre {
  public static final BlockState COAL_ORE_0 = new BlockState((short) 71, Block.COAL_ORE);

  public static void initStates() {
    Block.COAL_ORE.addBlockState(COAL_ORE_0);
  }
}
