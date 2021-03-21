package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Beacon {
  public static final BlockState BEACON_0 = new BlockState((short) 5660, Block.BEACON);

  public static void initStates() {
    Block.BEACON.addBlockState(BEACON_0);
  }
}
