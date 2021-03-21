package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DarkPrismarine {
  public static final BlockState DARK_PRISMARINE_0 = new BlockState((short) 7607, Block.DARK_PRISMARINE);

  public static void initStates() {
    Block.DARK_PRISMARINE.addBlockState(DARK_PRISMARINE_0);
  }
}
