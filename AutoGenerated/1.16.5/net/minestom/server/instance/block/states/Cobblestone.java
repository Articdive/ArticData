package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Cobblestone {
  public static final BlockState COBBLESTONE_0 = new BlockState((short) 14, Block.COBBLESTONE);

  public static void initStates() {
    Block.COBBLESTONE.addBlockState(COBBLESTONE_0);
  }
}
