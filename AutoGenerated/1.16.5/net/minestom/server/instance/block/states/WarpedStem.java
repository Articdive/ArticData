package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WarpedStem {
  public static final BlockState WARPED_STEM_0 = new BlockState((short) 14966, Block.WARPED_STEM);

  public static final BlockState WARPED_STEM_1 = new BlockState((short) 14967, Block.WARPED_STEM);

  public static final BlockState WARPED_STEM_2 = new BlockState((short) 14968, Block.WARPED_STEM);

  public static void initStates() {
    Block.WARPED_STEM.addBlockState(WARPED_STEM_0);
    Block.WARPED_STEM.addBlockState(WARPED_STEM_1);
    Block.WARPED_STEM.addBlockState(WARPED_STEM_2);
  }
}
