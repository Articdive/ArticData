package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CaveAir {
  public static final BlockState CAVE_AIR_0 = new BlockState((short) 9670, Block.CAVE_AIR);

  public static void initStates() {
    Block.CAVE_AIR.addBlockState(CAVE_AIR_0);
  }
}
