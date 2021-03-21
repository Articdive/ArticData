package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Spawner {
  public static final BlockState SPAWNER_0 = new BlockState((short) 1953, Block.SPAWNER);

  public static void initStates() {
    Block.SPAWNER.addBlockState(SPAWNER_0);
  }
}
