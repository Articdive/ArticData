package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Allium {
  public static final BlockState ALLIUM_0 = new BlockState((short) 1415, Block.ALLIUM);

  public static void initStates() {
    Block.ALLIUM.addBlockState(ALLIUM_0);
  }
}
