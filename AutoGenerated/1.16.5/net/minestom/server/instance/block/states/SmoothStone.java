package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SmoothStone {
  public static final BlockState SMOOTH_STONE_0 = new BlockState((short) 8418, Block.SMOOTH_STONE);

  public static void initStates() {
    Block.SMOOTH_STONE.addBlockState(SMOOTH_STONE_0);
  }
}
