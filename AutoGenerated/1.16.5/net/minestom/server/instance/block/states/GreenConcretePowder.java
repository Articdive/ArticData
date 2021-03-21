package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GreenConcretePowder {
  public static final BlockState GREEN_CONCRETE_POWDER_0 = new BlockState((short) 9471, Block.GREEN_CONCRETE_POWDER);

  public static void initStates() {
    Block.GREEN_CONCRETE_POWDER.addBlockState(GREEN_CONCRETE_POWDER_0);
  }
}
