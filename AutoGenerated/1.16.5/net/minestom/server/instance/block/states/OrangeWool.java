package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OrangeWool {
  public static final BlockState ORANGE_WOOL_0 = new BlockState((short) 1385, Block.ORANGE_WOOL);

  public static void initStates() {
    Block.ORANGE_WOOL.addBlockState(ORANGE_WOOL_0);
  }
}
