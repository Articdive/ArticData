package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BubbleCoral {
  public static final BlockState BUBBLE_CORAL_0 = new BlockState((short) 9538, Block.BUBBLE_CORAL);

  public static final BlockState BUBBLE_CORAL_1 = new BlockState((short) 9539, Block.BUBBLE_CORAL);

  public static void initStates() {
    Block.BUBBLE_CORAL.addBlockState(BUBBLE_CORAL_0);
    Block.BUBBLE_CORAL.addBlockState(BUBBLE_CORAL_1);
  }
}
