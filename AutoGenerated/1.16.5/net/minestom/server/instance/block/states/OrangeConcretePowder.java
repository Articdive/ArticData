package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OrangeConcretePowder {
  public static final BlockState ORANGE_CONCRETE_POWDER_0 = new BlockState((short) 9459, Block.ORANGE_CONCRETE_POWDER);

  public static void initStates() {
    Block.ORANGE_CONCRETE_POWDER.addBlockState(ORANGE_CONCRETE_POWDER_0);
  }
}
