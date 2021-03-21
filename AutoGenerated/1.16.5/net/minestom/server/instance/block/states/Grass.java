package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Grass {
  public static final BlockState GRASS_0 = new BlockState((short) 1342, Block.GRASS);

  public static void initStates() {
    Block.GRASS.addBlockState(GRASS_0);
  }
}
