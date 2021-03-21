package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Air {
  public static final BlockState AIR_0 = new BlockState((short) 0, Block.AIR);

  public static void initStates() {
    Block.AIR.addBlockState(AIR_0);
  }
}
