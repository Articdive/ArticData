package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Gravel {
  public static final BlockState GRAVEL_0 = new BlockState((short) 68, Block.GRAVEL);

  public static void initStates() {
    Block.GRAVEL.addBlockState(GRAVEL_0);
  }
}
