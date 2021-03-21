package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrayCarpet {
  public static final BlockState GRAY_CARPET_0 = new BlockState((short) 7877, Block.GRAY_CARPET);

  public static void initStates() {
    Block.GRAY_CARPET.addBlockState(GRAY_CARPET_0);
  }
}
