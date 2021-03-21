package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownConcretePowder {
  public static final BlockState BROWN_CONCRETE_POWDER_0 = new BlockState((short) 9470, Block.BROWN_CONCRETE_POWDER);

  public static void initStates() {
    Block.BROWN_CONCRETE_POWDER.addBlockState(BROWN_CONCRETE_POWDER_0);
  }
}
