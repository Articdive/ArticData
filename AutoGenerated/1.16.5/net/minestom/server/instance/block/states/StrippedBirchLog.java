package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedBirchLog {
  public static final BlockState STRIPPED_BIRCH_LOG_0 = new BlockState((short) 94, Block.STRIPPED_BIRCH_LOG);

  public static final BlockState STRIPPED_BIRCH_LOG_1 = new BlockState((short) 95, Block.STRIPPED_BIRCH_LOG);

  public static final BlockState STRIPPED_BIRCH_LOG_2 = new BlockState((short) 96, Block.STRIPPED_BIRCH_LOG);

  public static void initStates() {
    Block.STRIPPED_BIRCH_LOG.addBlockState(STRIPPED_BIRCH_LOG_0);
    Block.STRIPPED_BIRCH_LOG.addBlockState(STRIPPED_BIRCH_LOG_1);
    Block.STRIPPED_BIRCH_LOG.addBlockState(STRIPPED_BIRCH_LOG_2);
  }
}
