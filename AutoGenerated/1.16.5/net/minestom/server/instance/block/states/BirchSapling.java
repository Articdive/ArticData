package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BirchSapling {
  public static final BlockState BIRCH_SAPLING_0 = new BlockState((short) 25, Block.BIRCH_SAPLING);

  public static final BlockState BIRCH_SAPLING_1 = new BlockState((short) 26, Block.BIRCH_SAPLING);

  public static void initStates() {
    Block.BIRCH_SAPLING.addBlockState(BIRCH_SAPLING_0);
    Block.BIRCH_SAPLING.addBlockState(BIRCH_SAPLING_1);
  }
}
