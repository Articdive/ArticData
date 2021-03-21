package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightBlueStainedGlass {
  public static final BlockState LIGHT_BLUE_STAINED_GLASS_0 = new BlockState((short) 4098, Block.LIGHT_BLUE_STAINED_GLASS);

  public static void initStates() {
    Block.LIGHT_BLUE_STAINED_GLASS.addBlockState(LIGHT_BLUE_STAINED_GLASS_0);
  }
}
