package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlueConcrete {
  public static final BlockState BLUE_CONCRETE_0 = new BlockState((short) 9453, Block.BLUE_CONCRETE);

  public static void initStates() {
    Block.BLUE_CONCRETE.addBlockState(BLUE_CONCRETE_0);
  }
}
