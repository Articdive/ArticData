package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Barrier {
  public static final BlockState BARRIER_0 = new BlockState((short) 7540, Block.BARRIER);

  public static void initStates() {
    Block.BARRIER.addBlockState(BARRIER_0);
  }
}
