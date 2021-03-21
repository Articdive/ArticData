package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SoulSand {
  public static final BlockState SOUL_SAND_0 = new BlockState((short) 4000, Block.SOUL_SAND);

  public static void initStates() {
    Block.SOUL_SAND.addBlockState(SOUL_SAND_0);
  }
}
