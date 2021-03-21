package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class FletchingTable {
  public static final BlockState FLETCHING_TABLE_0 = new BlockState((short) 14824, Block.FLETCHING_TABLE);

  public static void initStates() {
    Block.FLETCHING_TABLE.addBlockState(FLETCHING_TABLE_0);
  }
}
