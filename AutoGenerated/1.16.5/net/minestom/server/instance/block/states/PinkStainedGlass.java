package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PinkStainedGlass {
  public static final BlockState PINK_STAINED_GLASS_0 = new BlockState((short) 4101, Block.PINK_STAINED_GLASS);

  public static void initStates() {
    Block.PINK_STAINED_GLASS.addBlockState(PINK_STAINED_GLASS_0);
  }
}
