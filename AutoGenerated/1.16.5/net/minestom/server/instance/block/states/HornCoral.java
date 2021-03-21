package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class HornCoral {
  public static final BlockState HORN_CORAL_0 = new BlockState((short) 9542, Block.HORN_CORAL);

  public static final BlockState HORN_CORAL_1 = new BlockState((short) 9543, Block.HORN_CORAL);

  public static void initStates() {
    Block.HORN_CORAL.addBlockState(HORN_CORAL_0);
    Block.HORN_CORAL.addBlockState(HORN_CORAL_1);
  }
}
