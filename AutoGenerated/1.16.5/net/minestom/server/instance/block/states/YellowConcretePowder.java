package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class YellowConcretePowder {
  public static final BlockState YELLOW_CONCRETE_POWDER_0 = new BlockState((short) 9462, Block.YELLOW_CONCRETE_POWDER);

  public static void initStates() {
    Block.YELLOW_CONCRETE_POWDER.addBlockState(YELLOW_CONCRETE_POWDER_0);
  }
}
