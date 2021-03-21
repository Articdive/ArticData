package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DarkOakLog {
  public static final BlockState DARK_OAK_LOG_0 = new BlockState((short) 88, Block.DARK_OAK_LOG);

  public static final BlockState DARK_OAK_LOG_1 = new BlockState((short) 89, Block.DARK_OAK_LOG);

  public static final BlockState DARK_OAK_LOG_2 = new BlockState((short) 90, Block.DARK_OAK_LOG);

  public static void initStates() {
    Block.DARK_OAK_LOG.addBlockState(DARK_OAK_LOG_0);
    Block.DARK_OAK_LOG.addBlockState(DARK_OAK_LOG_1);
    Block.DARK_OAK_LOG.addBlockState(DARK_OAK_LOG_2);
  }
}
