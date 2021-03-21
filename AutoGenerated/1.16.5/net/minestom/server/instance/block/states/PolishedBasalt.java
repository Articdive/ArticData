package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedBasalt {
  public static final BlockState POLISHED_BASALT_0 = new BlockState((short) 4005, Block.POLISHED_BASALT);

  public static final BlockState POLISHED_BASALT_1 = new BlockState((short) 4006, Block.POLISHED_BASALT);

  public static final BlockState POLISHED_BASALT_2 = new BlockState((short) 4007, Block.POLISHED_BASALT);

  public static void initStates() {
    Block.POLISHED_BASALT.addBlockState(POLISHED_BASALT_0);
    Block.POLISHED_BASALT.addBlockState(POLISHED_BASALT_1);
    Block.POLISHED_BASALT.addBlockState(POLISHED_BASALT_2);
  }
}
