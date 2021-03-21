package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadBush {
  public static final BlockState DEAD_BUSH_0 = new BlockState((short) 1344, Block.DEAD_BUSH);

  public static void initStates() {
    Block.DEAD_BUSH.addBlockState(DEAD_BUSH_0);
  }
}
