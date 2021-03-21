package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Blackstone {
  public static final BlockState BLACKSTONE_0 = new BlockState((short) 15847, Block.BLACKSTONE);

  public static void initStates() {
    Block.BLACKSTONE.addBlockState(BLACKSTONE_0);
  }
}
