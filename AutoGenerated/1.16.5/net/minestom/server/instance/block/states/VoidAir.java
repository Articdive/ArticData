package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class VoidAir {
  public static final BlockState VOID_AIR_0 = new BlockState((short) 9669, Block.VOID_AIR);

  public static void initStates() {
    Block.VOID_AIR.addBlockState(VOID_AIR_0);
  }
}
