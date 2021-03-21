package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Ladder {
  public static final BlockState LADDER_0 = new BlockState((short) 3637, Block.LADDER);

  public static final BlockState LADDER_1 = new BlockState((short) 3638, Block.LADDER);

  public static final BlockState LADDER_2 = new BlockState((short) 3639, Block.LADDER);

  public static final BlockState LADDER_3 = new BlockState((short) 3640, Block.LADDER);

  public static final BlockState LADDER_4 = new BlockState((short) 3641, Block.LADDER);

  public static final BlockState LADDER_5 = new BlockState((short) 3642, Block.LADDER);

  public static final BlockState LADDER_6 = new BlockState((short) 3643, Block.LADDER);

  public static final BlockState LADDER_7 = new BlockState((short) 3644, Block.LADDER);

  public static void initStates() {
    Block.LADDER.addBlockState(LADDER_0);
    Block.LADDER.addBlockState(LADDER_1);
    Block.LADDER.addBlockState(LADDER_2);
    Block.LADDER.addBlockState(LADDER_3);
    Block.LADDER.addBlockState(LADDER_4);
    Block.LADDER.addBlockState(LADDER_5);
    Block.LADDER.addBlockState(LADDER_6);
    Block.LADDER.addBlockState(LADDER_7);
  }
}
