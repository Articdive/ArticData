package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlackConcrete {
  public static final BlockState BLACK_CONCRETE_0 = new BlockState((short) 9457, Block.BLACK_CONCRETE);

  public static void initStates() {
    Block.BLACK_CONCRETE.addBlockState(BLACK_CONCRETE_0);
  }
}
