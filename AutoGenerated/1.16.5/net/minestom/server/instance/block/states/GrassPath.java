package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrassPath {
  public static final BlockState GRASS_PATH_0 = new BlockState((short) 9227, Block.GRASS_PATH);

  public static void initStates() {
    Block.GRASS_PATH.addBlockState(GRASS_PATH_0);
  }
}
