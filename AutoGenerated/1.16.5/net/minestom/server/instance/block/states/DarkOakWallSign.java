package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DarkOakWallSign {
  public static final BlockState DARK_OAK_WALL_SIGN_0 = new BlockState((short) 3775, Block.DARK_OAK_WALL_SIGN);

  public static final BlockState DARK_OAK_WALL_SIGN_1 = new BlockState((short) 3776, Block.DARK_OAK_WALL_SIGN);

  public static final BlockState DARK_OAK_WALL_SIGN_2 = new BlockState((short) 3777, Block.DARK_OAK_WALL_SIGN);

  public static final BlockState DARK_OAK_WALL_SIGN_3 = new BlockState((short) 3778, Block.DARK_OAK_WALL_SIGN);

  public static final BlockState DARK_OAK_WALL_SIGN_4 = new BlockState((short) 3779, Block.DARK_OAK_WALL_SIGN);

  public static final BlockState DARK_OAK_WALL_SIGN_5 = new BlockState((short) 3780, Block.DARK_OAK_WALL_SIGN);

  public static final BlockState DARK_OAK_WALL_SIGN_6 = new BlockState((short) 3781, Block.DARK_OAK_WALL_SIGN);

  public static final BlockState DARK_OAK_WALL_SIGN_7 = new BlockState((short) 3782, Block.DARK_OAK_WALL_SIGN);

  public static void initStates() {
    Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_0);
    Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_1);
    Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_2);
    Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_3);
    Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_4);
    Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_5);
    Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_6);
    Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_7);
  }
}
