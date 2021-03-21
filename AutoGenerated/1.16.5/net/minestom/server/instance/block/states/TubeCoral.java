package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class TubeCoral {
  public static final BlockState TUBE_CORAL_0 = new BlockState((short) 9534, Block.TUBE_CORAL);

  public static final BlockState TUBE_CORAL_1 = new BlockState((short) 9535, Block.TUBE_CORAL);

  public static void initStates() {
    Block.TUBE_CORAL.addBlockState(TUBE_CORAL_0);
    Block.TUBE_CORAL.addBlockState(TUBE_CORAL_1);
  }
}
