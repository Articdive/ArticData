package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadFireCoralFan {
  public static final BlockState DEAD_FIRE_CORAL_FAN_0 = new BlockState((short) 9550, Block.DEAD_FIRE_CORAL_FAN);

  public static final BlockState DEAD_FIRE_CORAL_FAN_1 = new BlockState((short) 9551, Block.DEAD_FIRE_CORAL_FAN);

  public static void initStates() {
    Block.DEAD_FIRE_CORAL_FAN.addBlockState(DEAD_FIRE_CORAL_FAN_0);
    Block.DEAD_FIRE_CORAL_FAN.addBlockState(DEAD_FIRE_CORAL_FAN_1);
  }
}
