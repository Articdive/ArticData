package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpleWool {
  public static final BlockState PURPLE_WOOL_0 = new BlockState((short) 1394, Block.PURPLE_WOOL);

  public static void initStates() {
    Block.PURPLE_WOOL.addBlockState(PURPLE_WOOL_0);
  }
}
