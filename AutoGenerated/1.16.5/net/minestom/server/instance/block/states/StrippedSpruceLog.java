package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedSpruceLog {
  public static final BlockState STRIPPED_SPRUCE_LOG_0 = new BlockState((short) 91, Block.STRIPPED_SPRUCE_LOG);

  public static final BlockState STRIPPED_SPRUCE_LOG_1 = new BlockState((short) 92, Block.STRIPPED_SPRUCE_LOG);

  public static final BlockState STRIPPED_SPRUCE_LOG_2 = new BlockState((short) 93, Block.STRIPPED_SPRUCE_LOG);

  public static void initStates() {
    Block.STRIPPED_SPRUCE_LOG.addBlockState(STRIPPED_SPRUCE_LOG_0);
    Block.STRIPPED_SPRUCE_LOG.addBlockState(STRIPPED_SPRUCE_LOG_1);
    Block.STRIPPED_SPRUCE_LOG.addBlockState(STRIPPED_SPRUCE_LOG_2);
  }
}
