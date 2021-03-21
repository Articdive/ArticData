package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GreenWool {
  public static final BlockState GREEN_WOOL_0 = new BlockState((short) 1397, Block.GREEN_WOOL);

  public static void initStates() {
    Block.GREEN_WOOL.addBlockState(GREEN_WOOL_0);
  }
}
