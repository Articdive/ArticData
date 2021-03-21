package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PinkCarpet {
  public static final BlockState PINK_CARPET_0 = new BlockState((short) 7876, Block.PINK_CARPET);

  public static void initStates() {
    Block.PINK_CARPET.addBlockState(PINK_CARPET_0);
  }
}
