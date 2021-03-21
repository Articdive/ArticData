package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DarkOakPlanks {
  public static final BlockState DARK_OAK_PLANKS_0 = new BlockState((short) 20, Block.DARK_OAK_PLANKS);

  public static void initStates() {
    Block.DARK_OAK_PLANKS.addBlockState(DARK_OAK_PLANKS_0);
  }
}
