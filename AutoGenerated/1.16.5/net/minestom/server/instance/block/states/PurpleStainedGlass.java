package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpleStainedGlass {
  public static final BlockState PURPLE_STAINED_GLASS_0 = new BlockState((short) 4105, Block.PURPLE_STAINED_GLASS);

  public static void initStates() {
    Block.PURPLE_STAINED_GLASS.addBlockState(PURPLE_STAINED_GLASS_0);
  }
}
