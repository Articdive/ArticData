package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class JunglePlanks {
  public static final BlockState JUNGLE_PLANKS_0 = new BlockState((short) 18, Block.JUNGLE_PLANKS);

  public static void initStates() {
    Block.JUNGLE_PLANKS.addBlockState(JUNGLE_PLANKS_0);
  }
}
