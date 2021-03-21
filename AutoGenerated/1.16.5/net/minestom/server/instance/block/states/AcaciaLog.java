package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AcaciaLog {
  public static final BlockState ACACIA_LOG_0 = new BlockState((short) 85, Block.ACACIA_LOG);

  public static final BlockState ACACIA_LOG_1 = new BlockState((short) 86, Block.ACACIA_LOG);

  public static final BlockState ACACIA_LOG_2 = new BlockState((short) 87, Block.ACACIA_LOG);

  public static void initStates() {
    Block.ACACIA_LOG.addBlockState(ACACIA_LOG_0);
    Block.ACACIA_LOG.addBlockState(ACACIA_LOG_1);
    Block.ACACIA_LOG.addBlockState(ACACIA_LOG_2);
  }
}
