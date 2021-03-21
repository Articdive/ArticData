package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownStainedGlass {
  public static final BlockState BROWN_STAINED_GLASS_0 = new BlockState((short) 4107, Block.BROWN_STAINED_GLASS);

  public static void initStates() {
    Block.BROWN_STAINED_GLASS.addBlockState(BROWN_STAINED_GLASS_0);
  }
}
