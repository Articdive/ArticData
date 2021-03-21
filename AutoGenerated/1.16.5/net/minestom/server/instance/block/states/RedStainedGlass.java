package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedStainedGlass {
  public static final BlockState RED_STAINED_GLASS_0 = new BlockState((short) 4109, Block.RED_STAINED_GLASS);

  public static void initStates() {
    Block.RED_STAINED_GLASS.addBlockState(RED_STAINED_GLASS_0);
  }
}
