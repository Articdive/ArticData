package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CyanConcretePowder {
  public static final BlockState CYAN_CONCRETE_POWDER_0 = new BlockState((short) 9467, Block.CYAN_CONCRETE_POWDER);

  public static void initStates() {
    Block.CYAN_CONCRETE_POWDER.addBlockState(CYAN_CONCRETE_POWDER_0);
  }
}
