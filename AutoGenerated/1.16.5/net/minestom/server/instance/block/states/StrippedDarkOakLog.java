package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedDarkOakLog {
  public static final BlockState STRIPPED_DARK_OAK_LOG_0 = new BlockState((short) 103, Block.STRIPPED_DARK_OAK_LOG);

  public static final BlockState STRIPPED_DARK_OAK_LOG_1 = new BlockState((short) 104, Block.STRIPPED_DARK_OAK_LOG);

  public static final BlockState STRIPPED_DARK_OAK_LOG_2 = new BlockState((short) 105, Block.STRIPPED_DARK_OAK_LOG);

  public static void initStates() {
    Block.STRIPPED_DARK_OAK_LOG.addBlockState(STRIPPED_DARK_OAK_LOG_0);
    Block.STRIPPED_DARK_OAK_LOG.addBlockState(STRIPPED_DARK_OAK_LOG_1);
    Block.STRIPPED_DARK_OAK_LOG.addBlockState(STRIPPED_DARK_OAK_LOG_2);
  }
}
