package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MovingPiston {
  public static final BlockState MOVING_PISTON_0 = new BlockState((short) 1400, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_1 = new BlockState((short) 1401, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_2 = new BlockState((short) 1402, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_3 = new BlockState((short) 1403, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_4 = new BlockState((short) 1404, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_5 = new BlockState((short) 1405, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_6 = new BlockState((short) 1406, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_7 = new BlockState((short) 1407, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_8 = new BlockState((short) 1408, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_9 = new BlockState((short) 1409, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_10 = new BlockState((short) 1410, Block.MOVING_PISTON);

  public static final BlockState MOVING_PISTON_11 = new BlockState((short) 1411, Block.MOVING_PISTON);

  public static void initStates() {
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_0);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_1);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_2);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_3);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_4);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_5);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_6);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_7);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_8);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_9);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_10);
    Block.MOVING_PISTON.addBlockState(MOVING_PISTON_11);
  }
}
