package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Fern {
  public static final BlockState FERN_0 = new BlockState((short) 1343, Block.FERN);

  public static void initStates() {
    Block.FERN.addBlockState(FERN_0);
  }
}
