package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedCactus {
  public static final BlockState POTTED_CACTUS_0 = new BlockState((short) 6333, Block.POTTED_CACTUS);

  public static void initStates() {
    Block.POTTED_CACTUS.addBlockState(POTTED_CACTUS_0);
  }
}
