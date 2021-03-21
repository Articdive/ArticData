package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class YellowConcrete {
  public static final BlockState YELLOW_CONCRETE_0 = new BlockState((short) 9446, Block.YELLOW_CONCRETE);

  public static void initStates() {
    Block.YELLOW_CONCRETE.addBlockState(YELLOW_CONCRETE_0);
  }
}
