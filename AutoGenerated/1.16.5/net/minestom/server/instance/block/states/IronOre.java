package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class IronOre {
  public static final BlockState IRON_ORE_0 = new BlockState((short) 70, Block.IRON_ORE);

  public static void initStates() {
    Block.IRON_ORE.addBlockState(IRON_ORE_0);
  }
}
