package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BirchLog {
  public static final BlockState BIRCH_LOG_0 = new BlockState((short) 79, Block.BIRCH_LOG);

  public static final BlockState BIRCH_LOG_1 = new BlockState((short) 80, Block.BIRCH_LOG);

  public static final BlockState BIRCH_LOG_2 = new BlockState((short) 81, Block.BIRCH_LOG);

  public static void initStates() {
    Block.BIRCH_LOG.addBlockState(BIRCH_LOG_0);
    Block.BIRCH_LOG.addBlockState(BIRCH_LOG_1);
    Block.BIRCH_LOG.addBlockState(BIRCH_LOG_2);
  }
}
