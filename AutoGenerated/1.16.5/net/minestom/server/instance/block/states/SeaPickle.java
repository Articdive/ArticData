package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SeaPickle {
  public static final BlockState SEA_PICKLE_0 = new BlockState((short) 9644, Block.SEA_PICKLE);

  public static final BlockState SEA_PICKLE_1 = new BlockState((short) 9645, Block.SEA_PICKLE);

  public static final BlockState SEA_PICKLE_2 = new BlockState((short) 9646, Block.SEA_PICKLE);

  public static final BlockState SEA_PICKLE_3 = new BlockState((short) 9647, Block.SEA_PICKLE);

  public static final BlockState SEA_PICKLE_4 = new BlockState((short) 9648, Block.SEA_PICKLE);

  public static final BlockState SEA_PICKLE_5 = new BlockState((short) 9649, Block.SEA_PICKLE);

  public static final BlockState SEA_PICKLE_6 = new BlockState((short) 9650, Block.SEA_PICKLE);

  public static final BlockState SEA_PICKLE_7 = new BlockState((short) 9651, Block.SEA_PICKLE);

  public static void initStates() {
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_0);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_1);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_2);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_3);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_4);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_5);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_6);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_7);
  }
}
