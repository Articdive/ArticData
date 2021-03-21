package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightGrayConcretePowder {
  public static final BlockState LIGHT_GRAY_CONCRETE_POWDER_0 = new BlockState((short) 9466, Block.LIGHT_GRAY_CONCRETE_POWDER);

  public static void initStates() {
    Block.LIGHT_GRAY_CONCRETE_POWDER.addBlockState(LIGHT_GRAY_CONCRETE_POWDER_0);
  }
}
