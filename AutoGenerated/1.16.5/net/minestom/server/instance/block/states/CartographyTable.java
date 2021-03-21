package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CartographyTable {
  public static final BlockState CARTOGRAPHY_TABLE_0 = new BlockState((short) 14823, Block.CARTOGRAPHY_TABLE);

  public static void initStates() {
    Block.CARTOGRAPHY_TABLE.addBlockState(CARTOGRAPHY_TABLE_0);
  }
}
