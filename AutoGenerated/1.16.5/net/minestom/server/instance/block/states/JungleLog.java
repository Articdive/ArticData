package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class JungleLog {
  public static final BlockState JUNGLE_LOG_0 = new BlockState((short) 82, Block.JUNGLE_LOG);

  public static final BlockState JUNGLE_LOG_1 = new BlockState((short) 83, Block.JUNGLE_LOG);

  public static final BlockState JUNGLE_LOG_2 = new BlockState((short) 84, Block.JUNGLE_LOG);

  public static void initStates() {
    Block.JUNGLE_LOG.addBlockState(JUNGLE_LOG_0);
    Block.JUNGLE_LOG.addBlockState(JUNGLE_LOG_1);
    Block.JUNGLE_LOG.addBlockState(JUNGLE_LOG_2);
  }
}
