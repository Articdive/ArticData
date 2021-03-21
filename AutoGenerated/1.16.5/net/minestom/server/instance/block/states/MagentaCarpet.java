package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MagentaCarpet {
  public static final BlockState MAGENTA_CARPET_0 = new BlockState((short) 7872, Block.MAGENTA_CARPET);

  public static void initStates() {
    Block.MAGENTA_CARPET.addBlockState(MAGENTA_CARPET_0);
  }
}
