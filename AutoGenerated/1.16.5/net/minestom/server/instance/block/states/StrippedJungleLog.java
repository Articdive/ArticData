package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedJungleLog {
  public static final BlockState STRIPPED_JUNGLE_LOG_0 = new BlockState((short) 97, Block.STRIPPED_JUNGLE_LOG);

  public static final BlockState STRIPPED_JUNGLE_LOG_1 = new BlockState((short) 98, Block.STRIPPED_JUNGLE_LOG);

  public static final BlockState STRIPPED_JUNGLE_LOG_2 = new BlockState((short) 99, Block.STRIPPED_JUNGLE_LOG);

  public static void initStates() {
    Block.STRIPPED_JUNGLE_LOG.addBlockState(STRIPPED_JUNGLE_LOG_0);
    Block.STRIPPED_JUNGLE_LOG.addBlockState(STRIPPED_JUNGLE_LOG_1);
    Block.STRIPPED_JUNGLE_LOG.addBlockState(STRIPPED_JUNGLE_LOG_2);
  }
}
