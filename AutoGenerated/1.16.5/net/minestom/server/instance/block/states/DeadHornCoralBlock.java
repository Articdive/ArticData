package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadHornCoralBlock {
  public static final BlockState DEAD_HORN_CORAL_BLOCK_0 = new BlockState((short) 9518, Block.DEAD_HORN_CORAL_BLOCK);

  public static void initStates() {
    Block.DEAD_HORN_CORAL_BLOCK.addBlockState(DEAD_HORN_CORAL_BLOCK_0);
  }
}
