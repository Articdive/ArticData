package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class FireCoral {
  public static final BlockState FIRE_CORAL_0 = new BlockState((short) 9540, Block.FIRE_CORAL);

  public static final BlockState FIRE_CORAL_1 = new BlockState((short) 9541, Block.FIRE_CORAL);

  public static void initStates() {
    Block.FIRE_CORAL.addBlockState(FIRE_CORAL_0);
    Block.FIRE_CORAL.addBlockState(FIRE_CORAL_1);
  }
}
