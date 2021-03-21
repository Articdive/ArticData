package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrayConcrete {
  public static final BlockState GRAY_CONCRETE_0 = new BlockState((short) 9449, Block.GRAY_CONCRETE);

  public static void initStates() {
    Block.GRAY_CONCRETE.addBlockState(GRAY_CONCRETE_0);
  }
}
