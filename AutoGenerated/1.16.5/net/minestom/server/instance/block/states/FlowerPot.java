package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class FlowerPot {
  public static final BlockState FLOWER_POT_0 = new BlockState((short) 6309, Block.FLOWER_POT);

  public static void initStates() {
    Block.FLOWER_POT.addBlockState(FLOWER_POT_0);
  }
}
