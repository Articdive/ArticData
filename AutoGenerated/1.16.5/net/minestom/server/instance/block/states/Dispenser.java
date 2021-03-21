package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Dispenser {
  public static final BlockState DISPENSER_0 = new BlockState((short) 234, Block.DISPENSER);

  public static final BlockState DISPENSER_1 = new BlockState((short) 235, Block.DISPENSER);

  public static final BlockState DISPENSER_2 = new BlockState((short) 236, Block.DISPENSER);

  public static final BlockState DISPENSER_3 = new BlockState((short) 237, Block.DISPENSER);

  public static final BlockState DISPENSER_4 = new BlockState((short) 238, Block.DISPENSER);

  public static final BlockState DISPENSER_5 = new BlockState((short) 239, Block.DISPENSER);

  public static final BlockState DISPENSER_6 = new BlockState((short) 240, Block.DISPENSER);

  public static final BlockState DISPENSER_7 = new BlockState((short) 241, Block.DISPENSER);

  public static final BlockState DISPENSER_8 = new BlockState((short) 242, Block.DISPENSER);

  public static final BlockState DISPENSER_9 = new BlockState((short) 243, Block.DISPENSER);

  public static final BlockState DISPENSER_10 = new BlockState((short) 244, Block.DISPENSER);

  public static final BlockState DISPENSER_11 = new BlockState((short) 245, Block.DISPENSER);

  public static void initStates() {
    Block.DISPENSER.addBlockState(DISPENSER_0);
    Block.DISPENSER.addBlockState(DISPENSER_1);
    Block.DISPENSER.addBlockState(DISPENSER_2);
    Block.DISPENSER.addBlockState(DISPENSER_3);
    Block.DISPENSER.addBlockState(DISPENSER_4);
    Block.DISPENSER.addBlockState(DISPENSER_5);
    Block.DISPENSER.addBlockState(DISPENSER_6);
    Block.DISPENSER.addBlockState(DISPENSER_7);
    Block.DISPENSER.addBlockState(DISPENSER_8);
    Block.DISPENSER.addBlockState(DISPENSER_9);
    Block.DISPENSER.addBlockState(DISPENSER_10);
    Block.DISPENSER.addBlockState(DISPENSER_11);
  }
}
