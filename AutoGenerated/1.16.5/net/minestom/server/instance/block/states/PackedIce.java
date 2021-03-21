package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PackedIce {
  public static final BlockState PACKED_ICE_0 = new BlockState((short) 7888, Block.PACKED_ICE);

  public static void initStates() {
    Block.PACKED_ICE.addBlockState(PACKED_ICE_0);
  }
}
