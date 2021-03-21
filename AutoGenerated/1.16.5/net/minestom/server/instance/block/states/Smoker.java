package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Smoker {
  public static final BlockState SMOKER_0 = new BlockState((short) 14807, Block.SMOKER);

  public static final BlockState SMOKER_1 = new BlockState((short) 14808, Block.SMOKER);

  public static final BlockState SMOKER_2 = new BlockState((short) 14809, Block.SMOKER);

  public static final BlockState SMOKER_3 = new BlockState((short) 14810, Block.SMOKER);

  public static final BlockState SMOKER_4 = new BlockState((short) 14811, Block.SMOKER);

  public static final BlockState SMOKER_5 = new BlockState((short) 14812, Block.SMOKER);

  public static final BlockState SMOKER_6 = new BlockState((short) 14813, Block.SMOKER);

  public static final BlockState SMOKER_7 = new BlockState((short) 14814, Block.SMOKER);

  public static void initStates() {
    Block.SMOKER.addBlockState(SMOKER_0);
    Block.SMOKER.addBlockState(SMOKER_1);
    Block.SMOKER.addBlockState(SMOKER_2);
    Block.SMOKER.addBlockState(SMOKER_3);
    Block.SMOKER.addBlockState(SMOKER_4);
    Block.SMOKER.addBlockState(SMOKER_5);
    Block.SMOKER.addBlockState(SMOKER_6);
    Block.SMOKER.addBlockState(SMOKER_7);
  }
}
