package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownCarpet {
  public static final BlockState BROWN_CARPET_0 = new BlockState((short) 7882, Block.BROWN_CARPET);

  public static void initStates() {
    Block.BROWN_CARPET.addBlockState(BROWN_CARPET_0);
  }
}
