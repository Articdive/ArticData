package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AcaciaPlanks {
  public static final BlockState ACACIA_PLANKS_0 = new BlockState((short) 19, Block.ACACIA_PLANKS);

  public static void initStates() {
    Block.ACACIA_PLANKS.addBlockState(ACACIA_PLANKS_0);
  }
}
