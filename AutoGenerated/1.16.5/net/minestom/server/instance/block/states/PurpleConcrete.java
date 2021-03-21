package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpleConcrete {
  public static final BlockState PURPLE_CONCRETE_0 = new BlockState((short) 9452, Block.PURPLE_CONCRETE);

  public static void initStates() {
    Block.PURPLE_CONCRETE.addBlockState(PURPLE_CONCRETE_0);
  }
}
