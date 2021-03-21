package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedWarpedStem {
  public static final BlockState STRIPPED_WARPED_STEM_0 = new BlockState((short) 14969, Block.STRIPPED_WARPED_STEM);

  public static final BlockState STRIPPED_WARPED_STEM_1 = new BlockState((short) 14970, Block.STRIPPED_WARPED_STEM);

  public static final BlockState STRIPPED_WARPED_STEM_2 = new BlockState((short) 14971, Block.STRIPPED_WARPED_STEM);

  public static void initStates() {
    Block.STRIPPED_WARPED_STEM.addBlockState(STRIPPED_WARPED_STEM_0);
    Block.STRIPPED_WARPED_STEM.addBlockState(STRIPPED_WARPED_STEM_1);
    Block.STRIPPED_WARPED_STEM.addBlockState(STRIPPED_WARPED_STEM_2);
  }
}
