package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CyanStainedGlass {
  public static final BlockState CYAN_STAINED_GLASS_0 = new BlockState((short) 4104, Block.CYAN_STAINED_GLASS);

  public static void initStates() {
    Block.CYAN_STAINED_GLASS.addBlockState(CYAN_STAINED_GLASS_0);
  }
}
