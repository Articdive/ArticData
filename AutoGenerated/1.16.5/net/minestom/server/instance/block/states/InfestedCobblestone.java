package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class InfestedCobblestone {
  public static final BlockState INFESTED_COBBLESTONE_0 = new BlockState((short) 4500, Block.INFESTED_COBBLESTONE);

  public static void initStates() {
    Block.INFESTED_COBBLESTONE.addBlockState(INFESTED_COBBLESTONE_0);
  }
}
