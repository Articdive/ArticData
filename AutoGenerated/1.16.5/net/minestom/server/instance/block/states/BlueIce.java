package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlueIce {
  public static final BlockState BLUE_ICE_0 = new BlockState((short) 9652, Block.BLUE_ICE);

  public static void initStates() {
    Block.BLUE_ICE.addBlockState(BLUE_ICE_0);
  }
}
