package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Sand {
  public static final BlockState SAND_0 = new BlockState((short) 66, Block.SAND);

  public static void initStates() {
    Block.SAND.addBlockState(SAND_0);
  }
}
