package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GreenCarpet {
  public static final BlockState GREEN_CARPET_0 = new BlockState((short) 7883, Block.GREEN_CARPET);

  public static void initStates() {
    Block.GREEN_CARPET.addBlockState(GREEN_CARPET_0);
  }
}
