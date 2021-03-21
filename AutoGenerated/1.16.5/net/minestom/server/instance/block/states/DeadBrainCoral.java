package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadBrainCoral {
  public static final BlockState DEAD_BRAIN_CORAL_0 = new BlockState((short) 9526, Block.DEAD_BRAIN_CORAL);

  public static final BlockState DEAD_BRAIN_CORAL_1 = new BlockState((short) 9527, Block.DEAD_BRAIN_CORAL);

  public static void initStates() {
    Block.DEAD_BRAIN_CORAL.addBlockState(DEAD_BRAIN_CORAL_0);
    Block.DEAD_BRAIN_CORAL.addBlockState(DEAD_BRAIN_CORAL_1);
  }
}
