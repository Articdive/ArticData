package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MossyCobblestone {
  public static final BlockState MOSSY_COBBLESTONE_0 = new BlockState((short) 1433, Block.MOSSY_COBBLESTONE);

  public static void initStates() {
    Block.MOSSY_COBBLESTONE.addBlockState(MOSSY_COBBLESTONE_0);
  }
}
