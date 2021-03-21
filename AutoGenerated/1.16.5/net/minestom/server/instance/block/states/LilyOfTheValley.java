package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LilyOfTheValley {
  public static final BlockState LILY_OF_THE_VALLEY_0 = new BlockState((short) 1424, Block.LILY_OF_THE_VALLEY);

  public static void initStates() {
    Block.LILY_OF_THE_VALLEY.addBlockState(LILY_OF_THE_VALLEY_0);
  }
}
