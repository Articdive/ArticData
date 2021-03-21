package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedAndesite {
  public static final BlockState POLISHED_ANDESITE_0 = new BlockState((short) 7, Block.POLISHED_ANDESITE);

  public static void initStates() {
    Block.POLISHED_ANDESITE.addBlockState(POLISHED_ANDESITE_0);
  }
}
