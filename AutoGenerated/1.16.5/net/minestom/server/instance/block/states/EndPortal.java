package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EndPortal {
  public static final BlockState END_PORTAL_0 = new BlockState((short) 5149, Block.END_PORTAL);

  public static void initStates() {
    Block.END_PORTAL.addBlockState(END_PORTAL_0);
  }
}
