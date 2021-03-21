package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WhiteWool {
  public static final BlockState WHITE_WOOL_0 = new BlockState((short) 1384, Block.WHITE_WOOL);

  public static void initStates() {
    Block.WHITE_WOOL.addBlockState(WHITE_WOOL_0);
  }
}
