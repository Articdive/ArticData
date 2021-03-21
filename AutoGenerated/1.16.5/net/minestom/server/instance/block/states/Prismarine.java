package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Prismarine {
  public static final BlockState PRISMARINE_0 = new BlockState((short) 7605, Block.PRISMARINE);

  public static void initStates() {
    Block.PRISMARINE.addBlockState(PRISMARINE_0);
  }
}
