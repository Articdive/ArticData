package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CraftingTable {
  public static final BlockState CRAFTING_TABLE_0 = new BlockState((short) 3356, Block.CRAFTING_TABLE);

  public static void initStates() {
    Block.CRAFTING_TABLE.addBlockState(CRAFTING_TABLE_0);
  }
}
