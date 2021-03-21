package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PoweredRail {
  public static final BlockState POWERED_RAIL_0 = new BlockState((short) 1305, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_1 = new BlockState((short) 1306, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_2 = new BlockState((short) 1307, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_3 = new BlockState((short) 1308, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_4 = new BlockState((short) 1309, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_5 = new BlockState((short) 1310, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_6 = new BlockState((short) 1311, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_7 = new BlockState((short) 1312, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_8 = new BlockState((short) 1313, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_9 = new BlockState((short) 1314, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_10 = new BlockState((short) 1315, Block.POWERED_RAIL);

  public static final BlockState POWERED_RAIL_11 = new BlockState((short) 1316, Block.POWERED_RAIL);

  public static void initStates() {
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_0);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_1);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_2);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_3);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_4);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_5);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_6);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_7);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_8);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_9);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_10);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_11);
  }
}
