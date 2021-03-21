package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LimeConcretePowder {
  public static final BlockState LIME_CONCRETE_POWDER_0 = new BlockState((short) 9463, Block.LIME_CONCRETE_POWDER);

  public static void initStates() {
    Block.LIME_CONCRETE_POWDER.addBlockState(LIME_CONCRETE_POWDER_0);
  }
}
