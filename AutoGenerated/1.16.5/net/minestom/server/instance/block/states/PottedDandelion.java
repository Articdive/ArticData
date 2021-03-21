package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedDandelion {
  public static final BlockState POTTED_DANDELION_0 = new BlockState((short) 6317, Block.POTTED_DANDELION);

  public static void initStates() {
    Block.POTTED_DANDELION.addBlockState(POTTED_DANDELION_0);
  }
}
