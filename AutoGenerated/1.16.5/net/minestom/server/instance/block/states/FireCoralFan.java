package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class FireCoralFan {
  public static final BlockState FIRE_CORAL_FAN_0 = new BlockState((short) 9560, Block.FIRE_CORAL_FAN);

  public static final BlockState FIRE_CORAL_FAN_1 = new BlockState((short) 9561, Block.FIRE_CORAL_FAN);

  public static void initStates() {
    Block.FIRE_CORAL_FAN.addBlockState(FIRE_CORAL_FAN_0);
    Block.FIRE_CORAL_FAN.addBlockState(FIRE_CORAL_FAN_1);
  }
}
