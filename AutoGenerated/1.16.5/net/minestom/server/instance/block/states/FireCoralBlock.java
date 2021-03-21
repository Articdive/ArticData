package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class FireCoralBlock {
  public static final BlockState FIRE_CORAL_BLOCK_0 = new BlockState((short) 9522, Block.FIRE_CORAL_BLOCK);

  public static void initStates() {
    Block.FIRE_CORAL_BLOCK.addBlockState(FIRE_CORAL_BLOCK_0);
  }
}
