package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Clay {
  public static final BlockState CLAY_0 = new BlockState((short) 3947, Block.CLAY);

  public static void initStates() {
    Block.CLAY.addBlockState(CLAY_0);
  }
}
