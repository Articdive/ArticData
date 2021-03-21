package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Dirt {
  public static final BlockState DIRT_0 = new BlockState((short) 10, Block.DIRT);

  public static void initStates() {
    Block.DIRT.addBlockState(DIRT_0);
  }
}
