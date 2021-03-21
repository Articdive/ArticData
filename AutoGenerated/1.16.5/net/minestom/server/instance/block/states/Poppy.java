package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Poppy {
  public static final BlockState POPPY_0 = new BlockState((short) 1413, Block.POPPY);

  public static void initStates() {
    Block.POPPY.addBlockState(POPPY_0);
  }
}
