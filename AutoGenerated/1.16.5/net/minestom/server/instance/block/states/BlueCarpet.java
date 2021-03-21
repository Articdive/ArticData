package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlueCarpet {
  public static final BlockState BLUE_CARPET_0 = new BlockState((short) 7881, Block.BLUE_CARPET);

  public static void initStates() {
    Block.BLUE_CARPET.addBlockState(BLUE_CARPET_0);
  }
}
