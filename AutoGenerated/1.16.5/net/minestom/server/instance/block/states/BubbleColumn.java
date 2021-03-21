package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BubbleColumn {
  public static final BlockState BUBBLE_COLUMN_0 = new BlockState((short) 9671, Block.BUBBLE_COLUMN);

  public static final BlockState BUBBLE_COLUMN_1 = new BlockState((short) 9672, Block.BUBBLE_COLUMN);

  public static void initStates() {
    Block.BUBBLE_COLUMN.addBlockState(BUBBLE_COLUMN_0);
    Block.BUBBLE_COLUMN.addBlockState(BUBBLE_COLUMN_1);
  }
}
