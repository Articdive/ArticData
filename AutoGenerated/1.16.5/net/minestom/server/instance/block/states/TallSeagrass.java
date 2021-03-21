package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class TallSeagrass {
  public static final BlockState TALL_SEAGRASS_0 = new BlockState((short) 1346, Block.TALL_SEAGRASS);

  public static final BlockState TALL_SEAGRASS_1 = new BlockState((short) 1347, Block.TALL_SEAGRASS);

  public static void initStates() {
    Block.TALL_SEAGRASS.addBlockState(TALL_SEAGRASS_0);
    Block.TALL_SEAGRASS.addBlockState(TALL_SEAGRASS_1);
  }
}
