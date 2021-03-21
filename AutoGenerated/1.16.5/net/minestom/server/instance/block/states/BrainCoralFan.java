package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrainCoralFan {
  public static final BlockState BRAIN_CORAL_FAN_0 = new BlockState((short) 9556, Block.BRAIN_CORAL_FAN);

  public static final BlockState BRAIN_CORAL_FAN_1 = new BlockState((short) 9557, Block.BRAIN_CORAL_FAN);

  public static void initStates() {
    Block.BRAIN_CORAL_FAN.addBlockState(BRAIN_CORAL_FAN_0);
    Block.BRAIN_CORAL_FAN.addBlockState(BRAIN_CORAL_FAN_1);
  }
}
