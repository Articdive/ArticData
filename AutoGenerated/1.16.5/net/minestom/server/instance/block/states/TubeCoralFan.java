package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class TubeCoralFan {
  public static final BlockState TUBE_CORAL_FAN_0 = new BlockState((short) 9554, Block.TUBE_CORAL_FAN);

  public static final BlockState TUBE_CORAL_FAN_1 = new BlockState((short) 9555, Block.TUBE_CORAL_FAN);

  public static void initStates() {
    Block.TUBE_CORAL_FAN.addBlockState(TUBE_CORAL_FAN_0);
    Block.TUBE_CORAL_FAN.addBlockState(TUBE_CORAL_FAN_1);
  }
}
