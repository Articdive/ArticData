package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class JungleSapling {
  public static final BlockState JUNGLE_SAPLING_0 = new BlockState((short) 27, Block.JUNGLE_SAPLING);

  public static final BlockState JUNGLE_SAPLING_1 = new BlockState((short) 28, Block.JUNGLE_SAPLING);

  public static void initStates() {
    Block.JUNGLE_SAPLING.addBlockState(JUNGLE_SAPLING_0);
    Block.JUNGLE_SAPLING.addBlockState(JUNGLE_SAPLING_1);
  }
}
