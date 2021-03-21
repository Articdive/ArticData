package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightGrayConcrete {
  public static final BlockState LIGHT_GRAY_CONCRETE_0 = new BlockState((short) 9450, Block.LIGHT_GRAY_CONCRETE);

  public static void initStates() {
    Block.LIGHT_GRAY_CONCRETE.addBlockState(LIGHT_GRAY_CONCRETE_0);
  }
}
