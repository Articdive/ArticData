package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OrangeConcrete {
  public static final BlockState ORANGE_CONCRETE_0 = new BlockState((short) 9443, Block.ORANGE_CONCRETE);

  public static void initStates() {
    Block.ORANGE_CONCRETE.addBlockState(ORANGE_CONCRETE_0);
  }
}
