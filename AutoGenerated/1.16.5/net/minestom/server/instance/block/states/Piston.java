package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Piston {
  public static final BlockState PISTON_0 = new BlockState((short) 1348, Block.PISTON);

  public static final BlockState PISTON_1 = new BlockState((short) 1349, Block.PISTON);

  public static final BlockState PISTON_2 = new BlockState((short) 1350, Block.PISTON);

  public static final BlockState PISTON_3 = new BlockState((short) 1351, Block.PISTON);

  public static final BlockState PISTON_4 = new BlockState((short) 1352, Block.PISTON);

  public static final BlockState PISTON_5 = new BlockState((short) 1353, Block.PISTON);

  public static final BlockState PISTON_6 = new BlockState((short) 1354, Block.PISTON);

  public static final BlockState PISTON_7 = new BlockState((short) 1355, Block.PISTON);

  public static final BlockState PISTON_8 = new BlockState((short) 1356, Block.PISTON);

  public static final BlockState PISTON_9 = new BlockState((short) 1357, Block.PISTON);

  public static final BlockState PISTON_10 = new BlockState((short) 1358, Block.PISTON);

  public static final BlockState PISTON_11 = new BlockState((short) 1359, Block.PISTON);

  public static void initStates() {
    Block.PISTON.addBlockState(PISTON_0);
    Block.PISTON.addBlockState(PISTON_1);
    Block.PISTON.addBlockState(PISTON_2);
    Block.PISTON.addBlockState(PISTON_3);
    Block.PISTON.addBlockState(PISTON_4);
    Block.PISTON.addBlockState(PISTON_5);
    Block.PISTON.addBlockState(PISTON_6);
    Block.PISTON.addBlockState(PISTON_7);
    Block.PISTON.addBlockState(PISTON_8);
    Block.PISTON.addBlockState(PISTON_9);
    Block.PISTON.addBlockState(PISTON_10);
    Block.PISTON.addBlockState(PISTON_11);
  }
}
