package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedSandstone {
  public static final BlockState RED_SANDSTONE_0 = new BlockState((short) 8221, Block.RED_SANDSTONE);

  public static void initStates() {
    Block.RED_SANDSTONE.addBlockState(RED_SANDSTONE_0);
  }
}
