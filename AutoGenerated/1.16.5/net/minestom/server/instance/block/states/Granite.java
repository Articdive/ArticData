package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Granite {
  public static final BlockState GRANITE_0 = new BlockState((short) 2, Block.GRANITE);

  public static void initStates() {
    Block.GRANITE.addBlockState(GRANITE_0);
  }
}
