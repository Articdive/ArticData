package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PinkWool {
  public static final BlockState PINK_WOOL_0 = new BlockState((short) 1390, Block.PINK_WOOL);

  public static void initStates() {
    Block.PINK_WOOL.addBlockState(PINK_WOOL_0);
  }
}
