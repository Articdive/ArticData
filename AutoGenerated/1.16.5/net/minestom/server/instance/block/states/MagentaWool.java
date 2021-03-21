package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MagentaWool {
  public static final BlockState MAGENTA_WOOL_0 = new BlockState((short) 1386, Block.MAGENTA_WOOL);

  public static void initStates() {
    Block.MAGENTA_WOOL.addBlockState(MAGENTA_WOOL_0);
  }
}
