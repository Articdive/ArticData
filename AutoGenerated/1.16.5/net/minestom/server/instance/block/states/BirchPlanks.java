package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BirchPlanks {
  public static final BlockState BIRCH_PLANKS_0 = new BlockState((short) 17, Block.BIRCH_PLANKS);

  public static void initStates() {
    Block.BIRCH_PLANKS.addBlockState(BIRCH_PLANKS_0);
  }
}
