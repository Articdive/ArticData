package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EnchantingTable {
  public static final BlockState ENCHANTING_TABLE_0 = new BlockState((short) 5136, Block.ENCHANTING_TABLE);

  public static void initStates() {
    Block.ENCHANTING_TABLE.addBlockState(ENCHANTING_TABLE_0);
  }
}
