package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrimsonNylium {
  public static final BlockState CRIMSON_NYLIUM_0 = new BlockState((short) 14995, Block.CRIMSON_NYLIUM);

  public static void initStates() {
    Block.CRIMSON_NYLIUM.addBlockState(CRIMSON_NYLIUM_0);
  }
}
