package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Basalt {
  public static final BlockState BASALT_0 = new BlockState((short) 4002, Block.BASALT);

  public static final BlockState BASALT_1 = new BlockState((short) 4003, Block.BASALT);

  public static final BlockState BASALT_2 = new BlockState((short) 4004, Block.BASALT);

  public static void initStates() {
    Block.BASALT.addBlockState(BASALT_0);
    Block.BASALT.addBlockState(BASALT_1);
    Block.BASALT.addBlockState(BASALT_2);
  }
}
