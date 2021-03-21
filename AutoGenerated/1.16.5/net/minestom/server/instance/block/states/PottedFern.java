package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedFern {
  public static final BlockState POTTED_FERN_0 = new BlockState((short) 6316, Block.POTTED_FERN);

  public static void initStates() {
    Block.POTTED_FERN.addBlockState(POTTED_FERN_0);
  }
}
