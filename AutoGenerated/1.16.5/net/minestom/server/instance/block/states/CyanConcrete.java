package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CyanConcrete {
  public static final BlockState CYAN_CONCRETE_0 = new BlockState((short) 9451, Block.CYAN_CONCRETE);

  public static void initStates() {
    Block.CYAN_CONCRETE.addBlockState(CYAN_CONCRETE_0);
  }
}
