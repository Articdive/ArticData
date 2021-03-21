package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpleCarpet {
  public static final BlockState PURPLE_CARPET_0 = new BlockState((short) 7880, Block.PURPLE_CARPET);

  public static void initStates() {
    Block.PURPLE_CARPET.addBlockState(PURPLE_CARPET_0);
  }
}
