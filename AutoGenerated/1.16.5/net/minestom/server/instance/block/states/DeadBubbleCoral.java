package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadBubbleCoral {
  public static final BlockState DEAD_BUBBLE_CORAL_0 = new BlockState((short) 9528, Block.DEAD_BUBBLE_CORAL);

  public static final BlockState DEAD_BUBBLE_CORAL_1 = new BlockState((short) 9529, Block.DEAD_BUBBLE_CORAL);

  public static void initStates() {
    Block.DEAD_BUBBLE_CORAL.addBlockState(DEAD_BUBBLE_CORAL_0);
    Block.DEAD_BUBBLE_CORAL.addBlockState(DEAD_BUBBLE_CORAL_1);
  }
}
