package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedLilyOfTheValley {
  public static final BlockState POTTED_LILY_OF_THE_VALLEY_0 = new BlockState((short) 6328, Block.POTTED_LILY_OF_THE_VALLEY);

  public static void initStates() {
    Block.POTTED_LILY_OF_THE_VALLEY.addBlockState(POTTED_LILY_OF_THE_VALLEY_0);
  }
}
