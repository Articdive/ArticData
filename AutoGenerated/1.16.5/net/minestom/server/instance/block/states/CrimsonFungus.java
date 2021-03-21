package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrimsonFungus {
  public static final BlockState CRIMSON_FUNGUS_0 = new BlockState((short) 14996, Block.CRIMSON_FUNGUS);

  public static void initStates() {
    Block.CRIMSON_FUNGUS.addBlockState(CRIMSON_FUNGUS_0);
  }
}
