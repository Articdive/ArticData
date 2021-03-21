package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LargeFern {
  public static final BlockState LARGE_FERN_0 = new BlockState((short) 7899, Block.LARGE_FERN);

  public static final BlockState LARGE_FERN_1 = new BlockState((short) 7900, Block.LARGE_FERN);

  public static void initStates() {
    Block.LARGE_FERN.addBlockState(LARGE_FERN_0);
    Block.LARGE_FERN.addBlockState(LARGE_FERN_1);
  }
}
