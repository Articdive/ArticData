package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadHornCoral {
  public static final BlockState DEAD_HORN_CORAL_0 = new BlockState((short) 9532, Block.DEAD_HORN_CORAL);

  public static final BlockState DEAD_HORN_CORAL_1 = new BlockState((short) 9533, Block.DEAD_HORN_CORAL);

  public static void initStates() {
    Block.DEAD_HORN_CORAL.addBlockState(DEAD_HORN_CORAL_0);
    Block.DEAD_HORN_CORAL.addBlockState(DEAD_HORN_CORAL_1);
  }
}
