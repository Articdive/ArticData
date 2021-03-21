package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpleConcretePowder {
  public static final BlockState PURPLE_CONCRETE_POWDER_0 = new BlockState((short) 9468, Block.PURPLE_CONCRETE_POWDER);

  public static void initStates() {
    Block.PURPLE_CONCRETE_POWDER.addBlockState(PURPLE_CONCRETE_POWDER_0);
  }
}
