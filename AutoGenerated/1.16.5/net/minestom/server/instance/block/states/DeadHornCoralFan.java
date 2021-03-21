package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadHornCoralFan {
  public static final BlockState DEAD_HORN_CORAL_FAN_0 = new BlockState((short) 9552, Block.DEAD_HORN_CORAL_FAN);

  public static final BlockState DEAD_HORN_CORAL_FAN_1 = new BlockState((short) 9553, Block.DEAD_HORN_CORAL_FAN);

  public static void initStates() {
    Block.DEAD_HORN_CORAL_FAN.addBlockState(DEAD_HORN_CORAL_FAN_0);
    Block.DEAD_HORN_CORAL_FAN.addBlockState(DEAD_HORN_CORAL_FAN_1);
  }
}
