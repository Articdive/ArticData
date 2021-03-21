package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrimsonPlanks {
  public static final BlockState CRIMSON_PLANKS_0 = new BlockState((short) 15053, Block.CRIMSON_PLANKS);

  public static void initStates() {
    Block.CRIMSON_PLANKS.addBlockState(CRIMSON_PLANKS_0);
  }
}
