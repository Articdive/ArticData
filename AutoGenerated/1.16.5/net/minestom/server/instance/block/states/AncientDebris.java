package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AncientDebris {
  public static final BlockState ANCIENT_DEBRIS_0 = new BlockState((short) 15835, Block.ANCIENT_DEBRIS);

  public static void initStates() {
    Block.ANCIENT_DEBRIS.addBlockState(ANCIENT_DEBRIS_0);
  }
}
