package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Glowstone {
  public static final BlockState GLOWSTONE_0 = new BlockState((short) 4013, Block.GLOWSTONE);

  public static void initStates() {
    Block.GLOWSTONE.addBlockState(GLOWSTONE_0);
  }
}
