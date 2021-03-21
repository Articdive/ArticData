package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrainCoralBlock {
  public static final BlockState BRAIN_CORAL_BLOCK_0 = new BlockState((short) 9520, Block.BRAIN_CORAL_BLOCK);

  public static void initStates() {
    Block.BRAIN_CORAL_BLOCK.addBlockState(BRAIN_CORAL_BLOCK_0);
  }
}
