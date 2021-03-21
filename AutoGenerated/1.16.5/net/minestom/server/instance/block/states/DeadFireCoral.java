package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadFireCoral {
  public static final BlockState DEAD_FIRE_CORAL_0 = new BlockState((short) 9530, Block.DEAD_FIRE_CORAL);

  public static final BlockState DEAD_FIRE_CORAL_1 = new BlockState((short) 9531, Block.DEAD_FIRE_CORAL);

  public static void initStates() {
    Block.DEAD_FIRE_CORAL.addBlockState(DEAD_FIRE_CORAL_0);
    Block.DEAD_FIRE_CORAL.addBlockState(DEAD_FIRE_CORAL_1);
  }
}
