package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrainCoral {
  public static final BlockState BRAIN_CORAL_0 = new BlockState((short) 9536, Block.BRAIN_CORAL);

  public static final BlockState BRAIN_CORAL_1 = new BlockState((short) 9537, Block.BRAIN_CORAL);

  public static void initStates() {
    Block.BRAIN_CORAL.addBlockState(BRAIN_CORAL_0);
    Block.BRAIN_CORAL.addBlockState(BRAIN_CORAL_1);
  }
}
