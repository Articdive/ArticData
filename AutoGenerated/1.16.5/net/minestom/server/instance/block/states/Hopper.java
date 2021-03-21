package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Hopper {
  public static final BlockState HOPPER_0 = new BlockState((short) 6732, Block.HOPPER);

  public static final BlockState HOPPER_1 = new BlockState((short) 6733, Block.HOPPER);

  public static final BlockState HOPPER_2 = new BlockState((short) 6734, Block.HOPPER);

  public static final BlockState HOPPER_3 = new BlockState((short) 6735, Block.HOPPER);

  public static final BlockState HOPPER_4 = new BlockState((short) 6736, Block.HOPPER);

  public static final BlockState HOPPER_5 = new BlockState((short) 6737, Block.HOPPER);

  public static final BlockState HOPPER_6 = new BlockState((short) 6738, Block.HOPPER);

  public static final BlockState HOPPER_7 = new BlockState((short) 6739, Block.HOPPER);

  public static final BlockState HOPPER_8 = new BlockState((short) 6740, Block.HOPPER);

  public static final BlockState HOPPER_9 = new BlockState((short) 6741, Block.HOPPER);

  public static void initStates() {
    Block.HOPPER.addBlockState(HOPPER_0);
    Block.HOPPER.addBlockState(HOPPER_1);
    Block.HOPPER.addBlockState(HOPPER_2);
    Block.HOPPER.addBlockState(HOPPER_3);
    Block.HOPPER.addBlockState(HOPPER_4);
    Block.HOPPER.addBlockState(HOPPER_5);
    Block.HOPPER.addBlockState(HOPPER_6);
    Block.HOPPER.addBlockState(HOPPER_7);
    Block.HOPPER.addBlockState(HOPPER_8);
    Block.HOPPER.addBlockState(HOPPER_9);
  }
}
