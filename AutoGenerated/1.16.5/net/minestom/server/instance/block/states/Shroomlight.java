package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Shroomlight {
  public static final BlockState SHROOMLIGHT_0 = new BlockState((short) 14997, Block.SHROOMLIGHT);

  public static void initStates() {
    Block.SHROOMLIGHT.addBlockState(SHROOMLIGHT_0);
  }
}
