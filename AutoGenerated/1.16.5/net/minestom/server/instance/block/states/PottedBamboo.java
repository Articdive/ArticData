package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedBamboo {
  public static final BlockState POTTED_BAMBOO_0 = new BlockState((short) 9668, Block.POTTED_BAMBOO);

  public static void initStates() {
    Block.POTTED_BAMBOO.addBlockState(POTTED_BAMBOO_0);
  }
}
