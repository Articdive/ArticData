package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedBlackstone {
  public static final BlockState POLISHED_BLACKSTONE_0 = new BlockState((short) 16258, Block.POLISHED_BLACKSTONE);

  public static void initStates() {
    Block.POLISHED_BLACKSTONE.addBlockState(POLISHED_BLACKSTONE_0);
  }
}
