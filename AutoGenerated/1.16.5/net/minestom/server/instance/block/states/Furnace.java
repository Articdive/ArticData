package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Furnace {
  public static final BlockState FURNACE_0 = new BlockState((short) 3373, Block.FURNACE);

  public static final BlockState FURNACE_1 = new BlockState((short) 3374, Block.FURNACE);

  public static final BlockState FURNACE_2 = new BlockState((short) 3375, Block.FURNACE);

  public static final BlockState FURNACE_3 = new BlockState((short) 3376, Block.FURNACE);

  public static final BlockState FURNACE_4 = new BlockState((short) 3377, Block.FURNACE);

  public static final BlockState FURNACE_5 = new BlockState((short) 3378, Block.FURNACE);

  public static final BlockState FURNACE_6 = new BlockState((short) 3379, Block.FURNACE);

  public static final BlockState FURNACE_7 = new BlockState((short) 3380, Block.FURNACE);

  public static void initStates() {
    Block.FURNACE.addBlockState(FURNACE_0);
    Block.FURNACE.addBlockState(FURNACE_1);
    Block.FURNACE.addBlockState(FURNACE_2);
    Block.FURNACE.addBlockState(FURNACE_3);
    Block.FURNACE.addBlockState(FURNACE_4);
    Block.FURNACE.addBlockState(FURNACE_5);
    Block.FURNACE.addBlockState(FURNACE_6);
    Block.FURNACE.addBlockState(FURNACE_7);
  }
}
