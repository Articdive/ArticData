package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LapisOre {
  public static final BlockState LAPIS_ORE_0 = new BlockState((short) 232, Block.LAPIS_ORE);

  public static void initStates() {
    Block.LAPIS_ORE.addBlockState(LAPIS_ORE_0);
  }
}
