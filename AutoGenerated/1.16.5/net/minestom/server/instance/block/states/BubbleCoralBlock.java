package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BubbleCoralBlock {
  public static final BlockState BUBBLE_CORAL_BLOCK_0 = new BlockState((short) 9521, Block.BUBBLE_CORAL_BLOCK);

  public static void initStates() {
    Block.BUBBLE_CORAL_BLOCK.addBlockState(BUBBLE_CORAL_BLOCK_0);
  }
}
