package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Rail {
  public static final BlockState RAIL_0 = new BlockState((short) 3645, Block.RAIL);

  public static final BlockState RAIL_1 = new BlockState((short) 3646, Block.RAIL);

  public static final BlockState RAIL_2 = new BlockState((short) 3647, Block.RAIL);

  public static final BlockState RAIL_3 = new BlockState((short) 3648, Block.RAIL);

  public static final BlockState RAIL_4 = new BlockState((short) 3649, Block.RAIL);

  public static final BlockState RAIL_5 = new BlockState((short) 3650, Block.RAIL);

  public static final BlockState RAIL_6 = new BlockState((short) 3651, Block.RAIL);

  public static final BlockState RAIL_7 = new BlockState((short) 3652, Block.RAIL);

  public static final BlockState RAIL_8 = new BlockState((short) 3653, Block.RAIL);

  public static final BlockState RAIL_9 = new BlockState((short) 3654, Block.RAIL);

  public static void initStates() {
    Block.RAIL.addBlockState(RAIL_0);
    Block.RAIL.addBlockState(RAIL_1);
    Block.RAIL.addBlockState(RAIL_2);
    Block.RAIL.addBlockState(RAIL_3);
    Block.RAIL.addBlockState(RAIL_4);
    Block.RAIL.addBlockState(RAIL_5);
    Block.RAIL.addBlockState(RAIL_6);
    Block.RAIL.addBlockState(RAIL_7);
    Block.RAIL.addBlockState(RAIL_8);
    Block.RAIL.addBlockState(RAIL_9);
  }
}
