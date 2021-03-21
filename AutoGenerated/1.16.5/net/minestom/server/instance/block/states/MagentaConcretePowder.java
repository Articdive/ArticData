package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MagentaConcretePowder {
  public static final BlockState MAGENTA_CONCRETE_POWDER_0 = new BlockState((short) 9460, Block.MAGENTA_CONCRETE_POWDER);

  public static void initStates() {
    Block.MAGENTA_CONCRETE_POWDER.addBlockState(MAGENTA_CONCRETE_POWDER_0);
  }
}
