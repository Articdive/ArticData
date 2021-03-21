package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BirchWallSign {
  public static final BlockState BIRCH_WALL_SIGN_0 = new BlockState((short) 3751, Block.BIRCH_WALL_SIGN);

  public static final BlockState BIRCH_WALL_SIGN_1 = new BlockState((short) 3752, Block.BIRCH_WALL_SIGN);

  public static final BlockState BIRCH_WALL_SIGN_2 = new BlockState((short) 3753, Block.BIRCH_WALL_SIGN);

  public static final BlockState BIRCH_WALL_SIGN_3 = new BlockState((short) 3754, Block.BIRCH_WALL_SIGN);

  public static final BlockState BIRCH_WALL_SIGN_4 = new BlockState((short) 3755, Block.BIRCH_WALL_SIGN);

  public static final BlockState BIRCH_WALL_SIGN_5 = new BlockState((short) 3756, Block.BIRCH_WALL_SIGN);

  public static final BlockState BIRCH_WALL_SIGN_6 = new BlockState((short) 3757, Block.BIRCH_WALL_SIGN);

  public static final BlockState BIRCH_WALL_SIGN_7 = new BlockState((short) 3758, Block.BIRCH_WALL_SIGN);

  public static void initStates() {
    Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_0);
    Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_1);
    Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_2);
    Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_3);
    Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_4);
    Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_5);
    Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_6);
    Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_7);
  }
}
