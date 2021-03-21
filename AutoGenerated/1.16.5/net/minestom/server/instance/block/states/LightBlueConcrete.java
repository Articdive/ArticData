package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightBlueConcrete {
  public static final BlockState LIGHT_BLUE_CONCRETE_0 = new BlockState((short) 9445, Block.LIGHT_BLUE_CONCRETE);

  public static void initStates() {
    Block.LIGHT_BLUE_CONCRETE.addBlockState(LIGHT_BLUE_CONCRETE_0);
  }
}
