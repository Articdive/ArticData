package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Dandelion {
  public static final BlockState DANDELION_0 = new BlockState((short) 1412, Block.DANDELION);

  public static void initStates() {
    Block.DANDELION.addBlockState(DANDELION_0);
  }
}
