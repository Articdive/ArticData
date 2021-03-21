package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MagentaConcrete {
  public static final BlockState MAGENTA_CONCRETE_0 = new BlockState((short) 9444, Block.MAGENTA_CONCRETE);

  public static void initStates() {
    Block.MAGENTA_CONCRETE.addBlockState(MAGENTA_CONCRETE_0);
  }
}
