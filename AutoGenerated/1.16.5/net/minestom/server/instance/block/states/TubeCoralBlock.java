package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class TubeCoralBlock {
  public static final BlockState TUBE_CORAL_BLOCK_0 = new BlockState((short) 9519, Block.TUBE_CORAL_BLOCK);

  public static void initStates() {
    Block.TUBE_CORAL_BLOCK.addBlockState(TUBE_CORAL_BLOCK_0);
  }
}
