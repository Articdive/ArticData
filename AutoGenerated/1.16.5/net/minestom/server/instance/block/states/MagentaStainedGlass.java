package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MagentaStainedGlass {
  public static final BlockState MAGENTA_STAINED_GLASS_0 = new BlockState((short) 4097, Block.MAGENTA_STAINED_GLASS);

  public static void initStates() {
    Block.MAGENTA_STAINED_GLASS.addBlockState(MAGENTA_STAINED_GLASS_0);
  }
}
