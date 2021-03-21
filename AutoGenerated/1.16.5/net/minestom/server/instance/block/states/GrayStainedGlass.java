package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrayStainedGlass {
  public static final BlockState GRAY_STAINED_GLASS_0 = new BlockState((short) 4102, Block.GRAY_STAINED_GLASS);

  public static void initStates() {
    Block.GRAY_STAINED_GLASS.addBlockState(GRAY_STAINED_GLASS_0);
  }
}
