package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BubbleCoralFan {
  public static final BlockState BUBBLE_CORAL_FAN_0 = new BlockState((short) 9558, Block.BUBBLE_CORAL_FAN);

  public static final BlockState BUBBLE_CORAL_FAN_1 = new BlockState((short) 9559, Block.BUBBLE_CORAL_FAN);

  public static void initStates() {
    Block.BUBBLE_CORAL_FAN.addBlockState(BUBBLE_CORAL_FAN_0);
    Block.BUBBLE_CORAL_FAN.addBlockState(BUBBLE_CORAL_FAN_1);
  }
}
