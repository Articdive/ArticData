package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedConcretePowder {
  public static final BlockState RED_CONCRETE_POWDER_0 = new BlockState((short) 9472, Block.RED_CONCRETE_POWDER);

  public static void initStates() {
    Block.RED_CONCRETE_POWDER.addBlockState(RED_CONCRETE_POWDER_0);
  }
}
