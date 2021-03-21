package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class HornCoralBlock {
  public static final BlockState HORN_CORAL_BLOCK_0 = new BlockState((short) 9523, Block.HORN_CORAL_BLOCK);

  public static void initStates() {
    Block.HORN_CORAL_BLOCK.addBlockState(HORN_CORAL_BLOCK_0);
  }
}
