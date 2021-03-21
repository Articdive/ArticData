package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CyanWool {
  public static final BlockState CYAN_WOOL_0 = new BlockState((short) 1393, Block.CYAN_WOOL);

  public static void initStates() {
    Block.CYAN_WOOL.addBlockState(CYAN_WOOL_0);
  }
}
