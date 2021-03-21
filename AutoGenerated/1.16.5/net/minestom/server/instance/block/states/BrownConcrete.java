package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownConcrete {
  public static final BlockState BROWN_CONCRETE_0 = new BlockState((short) 9454, Block.BROWN_CONCRETE);

  public static void initStates() {
    Block.BROWN_CONCRETE.addBlockState(BROWN_CONCRETE_0);
  }
}
