package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadTubeCoralFan {
  public static final BlockState DEAD_TUBE_CORAL_FAN_0 = new BlockState((short) 9544, Block.DEAD_TUBE_CORAL_FAN);

  public static final BlockState DEAD_TUBE_CORAL_FAN_1 = new BlockState((short) 9545, Block.DEAD_TUBE_CORAL_FAN);

  public static void initStates() {
    Block.DEAD_TUBE_CORAL_FAN.addBlockState(DEAD_TUBE_CORAL_FAN_0);
    Block.DEAD_TUBE_CORAL_FAN.addBlockState(DEAD_TUBE_CORAL_FAN_1);
  }
}
