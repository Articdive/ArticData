package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class NetherPortal {
  public static final BlockState NETHER_PORTAL_0 = new BlockState((short) 4014, Block.NETHER_PORTAL);

  public static final BlockState NETHER_PORTAL_1 = new BlockState((short) 4015, Block.NETHER_PORTAL);

  public static void initStates() {
    Block.NETHER_PORTAL.addBlockState(NETHER_PORTAL_0);
    Block.NETHER_PORTAL.addBlockState(NETHER_PORTAL_1);
  }
}
