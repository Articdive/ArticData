package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CutSandstone {
  public static final BlockState CUT_SANDSTONE_0 = new BlockState((short) 248, Block.CUT_SANDSTONE);

  public static void initStates() {
    Block.CUT_SANDSTONE.addBlockState(CUT_SANDSTONE_0);
  }
}
