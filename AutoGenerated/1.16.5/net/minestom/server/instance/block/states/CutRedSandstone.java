package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CutRedSandstone {
  public static final BlockState CUT_RED_SANDSTONE_0 = new BlockState((short) 8223, Block.CUT_RED_SANDSTONE);

  public static void initStates() {
    Block.CUT_RED_SANDSTONE.addBlockState(CUT_RED_SANDSTONE_0);
  }
}
