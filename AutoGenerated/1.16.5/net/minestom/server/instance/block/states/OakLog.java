package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OakLog {
  public static final BlockState OAK_LOG_0 = new BlockState((short) 73, Block.OAK_LOG);

  public static final BlockState OAK_LOG_1 = new BlockState((short) 74, Block.OAK_LOG);

  public static final BlockState OAK_LOG_2 = new BlockState((short) 75, Block.OAK_LOG);

  public static void initStates() {
    Block.OAK_LOG.addBlockState(OAK_LOG_0);
    Block.OAK_LOG.addBlockState(OAK_LOG_1);
    Block.OAK_LOG.addBlockState(OAK_LOG_2);
  }
}
