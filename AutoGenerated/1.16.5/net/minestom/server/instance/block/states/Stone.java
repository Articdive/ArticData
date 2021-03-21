package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Stone {
  public static final BlockState STONE_0 = new BlockState((short) 1, Block.STONE);

  public static void initStates() {
    Block.STONE.addBlockState(STONE_0);
  }
}
