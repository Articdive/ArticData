package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedDiorite {
  public static final BlockState POLISHED_DIORITE_0 = new BlockState((short) 5, Block.POLISHED_DIORITE);

  public static void initStates() {
    Block.POLISHED_DIORITE.addBlockState(POLISHED_DIORITE_0);
  }
}
