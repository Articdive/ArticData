package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedSand {
  public static final BlockState RED_SAND_0 = new BlockState((short) 67, Block.RED_SAND);

  public static void initStates() {
    Block.RED_SAND.addBlockState(RED_SAND_0);
  }
}
