package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SpruceLog {
  public static final BlockState SPRUCE_LOG_0 = new BlockState((short) 76, Block.SPRUCE_LOG);

  public static final BlockState SPRUCE_LOG_1 = new BlockState((short) 77, Block.SPRUCE_LOG);

  public static final BlockState SPRUCE_LOG_2 = new BlockState((short) 78, Block.SPRUCE_LOG);

  public static void initStates() {
    Block.SPRUCE_LOG.addBlockState(SPRUCE_LOG_0);
    Block.SPRUCE_LOG.addBlockState(SPRUCE_LOG_1);
    Block.SPRUCE_LOG.addBlockState(SPRUCE_LOG_2);
  }
}
