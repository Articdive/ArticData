package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Barrel {
  public static final BlockState BARREL_0 = new BlockState((short) 14795, Block.BARREL);

  public static final BlockState BARREL_1 = new BlockState((short) 14796, Block.BARREL);

  public static final BlockState BARREL_2 = new BlockState((short) 14797, Block.BARREL);

  public static final BlockState BARREL_3 = new BlockState((short) 14798, Block.BARREL);

  public static final BlockState BARREL_4 = new BlockState((short) 14799, Block.BARREL);

  public static final BlockState BARREL_5 = new BlockState((short) 14800, Block.BARREL);

  public static final BlockState BARREL_6 = new BlockState((short) 14801, Block.BARREL);

  public static final BlockState BARREL_7 = new BlockState((short) 14802, Block.BARREL);

  public static final BlockState BARREL_8 = new BlockState((short) 14803, Block.BARREL);

  public static final BlockState BARREL_9 = new BlockState((short) 14804, Block.BARREL);

  public static final BlockState BARREL_10 = new BlockState((short) 14805, Block.BARREL);

  public static final BlockState BARREL_11 = new BlockState((short) 14806, Block.BARREL);

  public static void initStates() {
    Block.BARREL.addBlockState(BARREL_0);
    Block.BARREL.addBlockState(BARREL_1);
    Block.BARREL.addBlockState(BARREL_2);
    Block.BARREL.addBlockState(BARREL_3);
    Block.BARREL.addBlockState(BARREL_4);
    Block.BARREL.addBlockState(BARREL_5);
    Block.BARREL.addBlockState(BARREL_6);
    Block.BARREL.addBlockState(BARREL_7);
    Block.BARREL.addBlockState(BARREL_8);
    Block.BARREL.addBlockState(BARREL_9);
    Block.BARREL.addBlockState(BARREL_10);
    Block.BARREL.addBlockState(BARREL_11);
  }
}
