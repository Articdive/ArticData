package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedOakLog {
  public static final BlockState STRIPPED_OAK_LOG_0 = new BlockState((short) 106, Block.STRIPPED_OAK_LOG);

  public static final BlockState STRIPPED_OAK_LOG_1 = new BlockState((short) 107, Block.STRIPPED_OAK_LOG);

  public static final BlockState STRIPPED_OAK_LOG_2 = new BlockState((short) 108, Block.STRIPPED_OAK_LOG);

  public static void initStates() {
    Block.STRIPPED_OAK_LOG.addBlockState(STRIPPED_OAK_LOG_0);
    Block.STRIPPED_OAK_LOG.addBlockState(STRIPPED_OAK_LOG_1);
    Block.STRIPPED_OAK_LOG.addBlockState(STRIPPED_OAK_LOG_2);
  }
}
