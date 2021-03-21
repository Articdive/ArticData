package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OrangeCarpet {
  public static final BlockState ORANGE_CARPET_0 = new BlockState((short) 7871, Block.ORANGE_CARPET);

  public static void initStates() {
    Block.ORANGE_CARPET.addBlockState(ORANGE_CARPET_0);
  }
}
