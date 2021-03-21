package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadTubeCoralBlock {
  public static final BlockState DEAD_TUBE_CORAL_BLOCK_0 = new BlockState((short) 9514, Block.DEAD_TUBE_CORAL_BLOCK);

  public static void initStates() {
    Block.DEAD_TUBE_CORAL_BLOCK.addBlockState(DEAD_TUBE_CORAL_BLOCK_0);
  }
}
