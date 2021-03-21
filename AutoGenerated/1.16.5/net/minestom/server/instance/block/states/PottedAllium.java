package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedAllium {
  public static final BlockState POTTED_ALLIUM_0 = new BlockState((short) 6320, Block.POTTED_ALLIUM);

  public static void initStates() {
    Block.POTTED_ALLIUM.addBlockState(POTTED_ALLIUM_0);
  }
}
