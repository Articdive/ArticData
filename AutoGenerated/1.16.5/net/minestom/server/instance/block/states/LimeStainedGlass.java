package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LimeStainedGlass {
  public static final BlockState LIME_STAINED_GLASS_0 = new BlockState((short) 4100, Block.LIME_STAINED_GLASS);

  public static void initStates() {
    Block.LIME_STAINED_GLASS.addBlockState(LIME_STAINED_GLASS_0);
  }
}
