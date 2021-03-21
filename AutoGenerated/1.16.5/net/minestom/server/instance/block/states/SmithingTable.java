package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SmithingTable {
  public static final BlockState SMITHING_TABLE_0 = new BlockState((short) 14853, Block.SMITHING_TABLE);

  public static void initStates() {
    Block.SMITHING_TABLE.addBlockState(SMITHING_TABLE_0);
  }
}
