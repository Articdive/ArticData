package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Wheat {
  public static final BlockState WHEAT_0 = new BlockState((short) 3357, Block.WHEAT);

  public static final BlockState WHEAT_1 = new BlockState((short) 3358, Block.WHEAT);

  public static final BlockState WHEAT_2 = new BlockState((short) 3359, Block.WHEAT);

  public static final BlockState WHEAT_3 = new BlockState((short) 3360, Block.WHEAT);

  public static final BlockState WHEAT_4 = new BlockState((short) 3361, Block.WHEAT);

  public static final BlockState WHEAT_5 = new BlockState((short) 3362, Block.WHEAT);

  public static final BlockState WHEAT_6 = new BlockState((short) 3363, Block.WHEAT);

  public static final BlockState WHEAT_7 = new BlockState((short) 3364, Block.WHEAT);

  public static void initStates() {
    Block.WHEAT.addBlockState(WHEAT_0);
    Block.WHEAT.addBlockState(WHEAT_1);
    Block.WHEAT.addBlockState(WHEAT_2);
    Block.WHEAT.addBlockState(WHEAT_3);
    Block.WHEAT.addBlockState(WHEAT_4);
    Block.WHEAT.addBlockState(WHEAT_5);
    Block.WHEAT.addBlockState(WHEAT_6);
    Block.WHEAT.addBlockState(WHEAT_7);
  }
}
