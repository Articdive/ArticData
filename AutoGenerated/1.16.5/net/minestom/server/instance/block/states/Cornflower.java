package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Cornflower {
  public static final BlockState CORNFLOWER_0 = new BlockState((short) 1422, Block.CORNFLOWER);

  public static void initStates() {
    Block.CORNFLOWER.addBlockState(CORNFLOWER_0);
  }
}
