package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightGrayStainedGlass {
  public static final BlockState LIGHT_GRAY_STAINED_GLASS_0 = new BlockState((short) 4103, Block.LIGHT_GRAY_STAINED_GLASS);

  public static void initStates() {
    Block.LIGHT_GRAY_STAINED_GLASS.addBlockState(LIGHT_GRAY_STAINED_GLASS_0);
  }
}
