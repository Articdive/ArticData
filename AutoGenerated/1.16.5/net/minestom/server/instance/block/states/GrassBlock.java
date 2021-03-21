package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrassBlock {
  public static final BlockState GRASS_BLOCK_0 = new BlockState((short) 8, Block.GRASS_BLOCK);

  public static final BlockState GRASS_BLOCK_1 = new BlockState((short) 9, Block.GRASS_BLOCK);

  public static void initStates() {
    Block.GRASS_BLOCK.addBlockState(GRASS_BLOCK_0);
    Block.GRASS_BLOCK.addBlockState(GRASS_BLOCK_1);
  }
}
