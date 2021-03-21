package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadBrainCoralBlock {
  public static final BlockState DEAD_BRAIN_CORAL_BLOCK_0 = new BlockState((short) 9515, Block.DEAD_BRAIN_CORAL_BLOCK);

  public static void initStates() {
    Block.DEAD_BRAIN_CORAL_BLOCK.addBlockState(DEAD_BRAIN_CORAL_BLOCK_0);
  }
}
