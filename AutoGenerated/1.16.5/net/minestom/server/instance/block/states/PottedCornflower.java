package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedCornflower {
  public static final BlockState POTTED_CORNFLOWER_0 = new BlockState((short) 6327, Block.POTTED_CORNFLOWER);

  public static void initStates() {
    Block.POTTED_CORNFLOWER.addBlockState(POTTED_CORNFLOWER_0);
  }
}
