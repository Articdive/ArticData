package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedDeadBush {
  public static final BlockState POTTED_DEAD_BUSH_0 = new BlockState((short) 6332, Block.POTTED_DEAD_BUSH);

  public static void initStates() {
    Block.POTTED_DEAD_BUSH.addBlockState(POTTED_DEAD_BUSH_0);
  }
}
