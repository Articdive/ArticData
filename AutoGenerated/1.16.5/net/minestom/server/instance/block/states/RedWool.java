package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedWool {
  public static final BlockState RED_WOOL_0 = new BlockState((short) 1398, Block.RED_WOOL);

  public static void initStates() {
    Block.RED_WOOL.addBlockState(RED_WOOL_0);
  }
}
