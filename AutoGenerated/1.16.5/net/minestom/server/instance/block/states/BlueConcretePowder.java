package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlueConcretePowder {
  public static final BlockState BLUE_CONCRETE_POWDER_0 = new BlockState((short) 9469, Block.BLUE_CONCRETE_POWDER);

  public static void initStates() {
    Block.BLUE_CONCRETE_POWDER.addBlockState(BLUE_CONCRETE_POWDER_0);
  }
}
