package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class YellowStainedGlass {
  public static final BlockState YELLOW_STAINED_GLASS_0 = new BlockState((short) 4099, Block.YELLOW_STAINED_GLASS);

  public static void initStates() {
    Block.YELLOW_STAINED_GLASS.addBlockState(YELLOW_STAINED_GLASS_0);
  }
}
