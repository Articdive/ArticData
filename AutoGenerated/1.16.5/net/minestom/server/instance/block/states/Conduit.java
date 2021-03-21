package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Conduit {
  public static final BlockState CONDUIT_0 = new BlockState((short) 9653, Block.CONDUIT);

  public static final BlockState CONDUIT_1 = new BlockState((short) 9654, Block.CONDUIT);

  public static void initStates() {
    Block.CONDUIT.addBlockState(CONDUIT_0);
    Block.CONDUIT.addBlockState(CONDUIT_1);
  }
}
