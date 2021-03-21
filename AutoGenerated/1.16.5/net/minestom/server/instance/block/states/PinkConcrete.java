package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PinkConcrete {
  public static final BlockState PINK_CONCRETE_0 = new BlockState((short) 9448, Block.PINK_CONCRETE);

  public static void initStates() {
    Block.PINK_CONCRETE.addBlockState(PINK_CONCRETE_0);
  }
}
