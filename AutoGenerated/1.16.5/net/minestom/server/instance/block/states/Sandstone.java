package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Sandstone {
  public static final BlockState SANDSTONE_0 = new BlockState((short) 246, Block.SANDSTONE);

  public static void initStates() {
    Block.SANDSTONE.addBlockState(SANDSTONE_0);
  }
}
