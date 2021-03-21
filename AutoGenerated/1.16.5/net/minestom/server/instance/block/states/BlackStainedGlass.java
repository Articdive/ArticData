package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlackStainedGlass {
  public static final BlockState BLACK_STAINED_GLASS_0 = new BlockState((short) 4110, Block.BLACK_STAINED_GLASS);

  public static void initStates() {
    Block.BLACK_STAINED_GLASS.addBlockState(BLACK_STAINED_GLASS_0);
  }
}
