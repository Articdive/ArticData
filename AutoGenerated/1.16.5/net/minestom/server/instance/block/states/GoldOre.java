package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GoldOre {
  public static final BlockState GOLD_ORE_0 = new BlockState((short) 69, Block.GOLD_ORE);

  public static void initStates() {
    Block.GOLD_ORE.addBlockState(GOLD_ORE_0);
  }
}
