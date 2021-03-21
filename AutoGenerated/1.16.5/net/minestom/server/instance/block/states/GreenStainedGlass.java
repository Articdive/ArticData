package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GreenStainedGlass {
  public static final BlockState GREEN_STAINED_GLASS_0 = new BlockState((short) 4108, Block.GREEN_STAINED_GLASS);

  public static void initStates() {
    Block.GREEN_STAINED_GLASS.addBlockState(GREEN_STAINED_GLASS_0);
  }
}
