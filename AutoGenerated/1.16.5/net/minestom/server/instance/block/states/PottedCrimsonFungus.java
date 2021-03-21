package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedCrimsonFungus {
  public static final BlockState POTTED_CRIMSON_FUNGUS_0 = new BlockState((short) 15842, Block.POTTED_CRIMSON_FUNGUS);

  public static void initStates() {
    Block.POTTED_CRIMSON_FUNGUS.addBlockState(POTTED_CRIMSON_FUNGUS_0);
  }
}
