package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Potatoes {
  public static final BlockState POTATOES_0 = new BlockState((short) 6342, Block.POTATOES);

  public static final BlockState POTATOES_1 = new BlockState((short) 6343, Block.POTATOES);

  public static final BlockState POTATOES_2 = new BlockState((short) 6344, Block.POTATOES);

  public static final BlockState POTATOES_3 = new BlockState((short) 6345, Block.POTATOES);

  public static final BlockState POTATOES_4 = new BlockState((short) 6346, Block.POTATOES);

  public static final BlockState POTATOES_5 = new BlockState((short) 6347, Block.POTATOES);

  public static final BlockState POTATOES_6 = new BlockState((short) 6348, Block.POTATOES);

  public static final BlockState POTATOES_7 = new BlockState((short) 6349, Block.POTATOES);

  public static void initStates() {
    Block.POTATOES.addBlockState(POTATOES_0);
    Block.POTATOES.addBlockState(POTATOES_1);
    Block.POTATOES.addBlockState(POTATOES_2);
    Block.POTATOES.addBlockState(POTATOES_3);
    Block.POTATOES.addBlockState(POTATOES_4);
    Block.POTATOES.addBlockState(POTATOES_5);
    Block.POTATOES.addBlockState(POTATOES_6);
    Block.POTATOES.addBlockState(POTATOES_7);
  }
}
