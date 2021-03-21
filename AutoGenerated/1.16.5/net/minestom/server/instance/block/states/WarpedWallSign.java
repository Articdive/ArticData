package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WarpedWallSign {
  public static final BlockState WARPED_WALL_SIGN_0 = new BlockState((short) 15735, Block.WARPED_WALL_SIGN);

  public static final BlockState WARPED_WALL_SIGN_1 = new BlockState((short) 15736, Block.WARPED_WALL_SIGN);

  public static final BlockState WARPED_WALL_SIGN_2 = new BlockState((short) 15737, Block.WARPED_WALL_SIGN);

  public static final BlockState WARPED_WALL_SIGN_3 = new BlockState((short) 15738, Block.WARPED_WALL_SIGN);

  public static final BlockState WARPED_WALL_SIGN_4 = new BlockState((short) 15739, Block.WARPED_WALL_SIGN);

  public static final BlockState WARPED_WALL_SIGN_5 = new BlockState((short) 15740, Block.WARPED_WALL_SIGN);

  public static final BlockState WARPED_WALL_SIGN_6 = new BlockState((short) 15741, Block.WARPED_WALL_SIGN);

  public static final BlockState WARPED_WALL_SIGN_7 = new BlockState((short) 15742, Block.WARPED_WALL_SIGN);

  public static void initStates() {
    Block.WARPED_WALL_SIGN.addBlockState(WARPED_WALL_SIGN_0);
    Block.WARPED_WALL_SIGN.addBlockState(WARPED_WALL_SIGN_1);
    Block.WARPED_WALL_SIGN.addBlockState(WARPED_WALL_SIGN_2);
    Block.WARPED_WALL_SIGN.addBlockState(WARPED_WALL_SIGN_3);
    Block.WARPED_WALL_SIGN.addBlockState(WARPED_WALL_SIGN_4);
    Block.WARPED_WALL_SIGN.addBlockState(WARPED_WALL_SIGN_5);
    Block.WARPED_WALL_SIGN.addBlockState(WARPED_WALL_SIGN_6);
    Block.WARPED_WALL_SIGN.addBlockState(WARPED_WALL_SIGN_7);
  }
}
