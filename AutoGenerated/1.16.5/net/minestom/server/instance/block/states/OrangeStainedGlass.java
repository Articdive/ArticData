package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OrangeStainedGlass {
  public static final BlockState ORANGE_STAINED_GLASS_0 = new BlockState((short) 4096, Block.ORANGE_STAINED_GLASS);

  public static void initStates() {
    Block.ORANGE_STAINED_GLASS.addBlockState(ORANGE_STAINED_GLASS_0);
  }
}
