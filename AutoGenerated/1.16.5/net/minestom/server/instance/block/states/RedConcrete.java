package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedConcrete {
  public static final BlockState RED_CONCRETE_0 = new BlockState((short) 9456, Block.RED_CONCRETE);

  public static void initStates() {
    Block.RED_CONCRETE.addBlockState(RED_CONCRETE_0);
  }
}
