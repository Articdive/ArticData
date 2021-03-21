package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrayConcretePowder {
  public static final BlockState GRAY_CONCRETE_POWDER_0 = new BlockState((short) 9465, Block.GRAY_CONCRETE_POWDER);

  public static void initStates() {
    Block.GRAY_CONCRETE_POWDER.addBlockState(GRAY_CONCRETE_POWDER_0);
  }
}
