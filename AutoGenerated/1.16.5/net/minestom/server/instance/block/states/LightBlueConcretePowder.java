package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightBlueConcretePowder {
  public static final BlockState LIGHT_BLUE_CONCRETE_POWDER_0 = new BlockState((short) 9461, Block.LIGHT_BLUE_CONCRETE_POWDER);

  public static void initStates() {
    Block.LIGHT_BLUE_CONCRETE_POWDER.addBlockState(LIGHT_BLUE_CONCRETE_POWDER_0);
  }
}
