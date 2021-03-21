package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedSpruceSapling {
  public static final BlockState POTTED_SPRUCE_SAPLING_0 = new BlockState((short) 6311, Block.POTTED_SPRUCE_SAPLING);

  public static void initStates() {
    Block.POTTED_SPRUCE_SAPLING.addBlockState(POTTED_SPRUCE_SAPLING_0);
  }
}
