package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BambooSapling {
  public static final BlockState BAMBOO_SAPLING_0 = new BlockState((short) 9655, Block.BAMBOO_SAPLING);

  public static void initStates() {
    Block.BAMBOO_SAPLING.addBlockState(BAMBOO_SAPLING_0);
  }
}
