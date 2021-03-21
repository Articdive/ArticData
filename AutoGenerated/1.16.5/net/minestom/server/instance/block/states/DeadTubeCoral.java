package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadTubeCoral {
  public static final BlockState DEAD_TUBE_CORAL_0 = new BlockState((short) 9524, Block.DEAD_TUBE_CORAL);

  public static final BlockState DEAD_TUBE_CORAL_1 = new BlockState((short) 9525, Block.DEAD_TUBE_CORAL);

  public static void initStates() {
    Block.DEAD_TUBE_CORAL.addBlockState(DEAD_TUBE_CORAL_0);
    Block.DEAD_TUBE_CORAL.addBlockState(DEAD_TUBE_CORAL_1);
  }
}
