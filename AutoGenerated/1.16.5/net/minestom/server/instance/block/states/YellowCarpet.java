package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class YellowCarpet {
  public static final BlockState YELLOW_CARPET_0 = new BlockState((short) 7874, Block.YELLOW_CARPET);

  public static void initStates() {
    Block.YELLOW_CARPET.addBlockState(YELLOW_CARPET_0);
  }
}
