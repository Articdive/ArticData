package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlackConcretePowder {
  public static final BlockState BLACK_CONCRETE_POWDER_0 = new BlockState((short) 9473, Block.BLACK_CONCRETE_POWDER);

  public static void initStates() {
    Block.BLACK_CONCRETE_POWDER.addBlockState(BLACK_CONCRETE_POWDER_0);
  }
}
