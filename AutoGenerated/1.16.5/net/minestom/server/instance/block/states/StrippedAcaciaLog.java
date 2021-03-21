package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedAcaciaLog {
  public static final BlockState STRIPPED_ACACIA_LOG_0 = new BlockState((short) 100, Block.STRIPPED_ACACIA_LOG);

  public static final BlockState STRIPPED_ACACIA_LOG_1 = new BlockState((short) 101, Block.STRIPPED_ACACIA_LOG);

  public static final BlockState STRIPPED_ACACIA_LOG_2 = new BlockState((short) 102, Block.STRIPPED_ACACIA_LOG);

  public static void initStates() {
    Block.STRIPPED_ACACIA_LOG.addBlockState(STRIPPED_ACACIA_LOG_0);
    Block.STRIPPED_ACACIA_LOG.addBlockState(STRIPPED_ACACIA_LOG_1);
    Block.STRIPPED_ACACIA_LOG.addBlockState(STRIPPED_ACACIA_LOG_2);
  }
}
