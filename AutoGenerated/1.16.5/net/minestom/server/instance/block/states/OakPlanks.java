package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OakPlanks {
  public static final BlockState OAK_PLANKS_0 = new BlockState((short) 15, Block.OAK_PLANKS);

  public static void initStates() {
    Block.OAK_PLANKS.addBlockState(OAK_PLANKS_0);
  }
}
