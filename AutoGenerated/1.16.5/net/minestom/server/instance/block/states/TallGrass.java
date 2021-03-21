package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class TallGrass {
  public static final BlockState TALL_GRASS_0 = new BlockState((short) 7897, Block.TALL_GRASS);

  public static final BlockState TALL_GRASS_1 = new BlockState((short) 7898, Block.TALL_GRASS);

  public static void initStates() {
    Block.TALL_GRASS.addBlockState(TALL_GRASS_0);
    Block.TALL_GRASS.addBlockState(TALL_GRASS_1);
  }
}
