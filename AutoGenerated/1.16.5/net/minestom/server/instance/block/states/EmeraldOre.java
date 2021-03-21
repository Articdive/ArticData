package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EmeraldOre {
  public static final BlockState EMERALD_ORE_0 = new BlockState((short) 5254, Block.EMERALD_ORE);

  public static void initStates() {
    Block.EMERALD_ORE.addBlockState(EMERALD_ORE_0);
  }
}
