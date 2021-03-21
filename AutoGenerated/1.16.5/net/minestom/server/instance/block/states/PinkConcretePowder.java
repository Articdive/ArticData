package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PinkConcretePowder {
  public static final BlockState PINK_CONCRETE_POWDER_0 = new BlockState((short) 9464, Block.PINK_CONCRETE_POWDER);

  public static void initStates() {
    Block.PINK_CONCRETE_POWDER.addBlockState(PINK_CONCRETE_POWDER_0);
  }
}
