package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SpruceSapling {
  public static final BlockState SPRUCE_SAPLING_0 = new BlockState((short) 23, Block.SPRUCE_SAPLING);

  public static final BlockState SPRUCE_SAPLING_1 = new BlockState((short) 24, Block.SPRUCE_SAPLING);

  public static void initStates() {
    Block.SPRUCE_SAPLING.addBlockState(SPRUCE_SAPLING_0);
    Block.SPRUCE_SAPLING.addBlockState(SPRUCE_SAPLING_1);
  }
}
