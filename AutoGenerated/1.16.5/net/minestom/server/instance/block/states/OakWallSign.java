package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OakWallSign {
  public static final BlockState OAK_WALL_SIGN_0 = new BlockState((short) 3735, Block.OAK_WALL_SIGN);

  public static final BlockState OAK_WALL_SIGN_1 = new BlockState((short) 3736, Block.OAK_WALL_SIGN);

  public static final BlockState OAK_WALL_SIGN_2 = new BlockState((short) 3737, Block.OAK_WALL_SIGN);

  public static final BlockState OAK_WALL_SIGN_3 = new BlockState((short) 3738, Block.OAK_WALL_SIGN);

  public static final BlockState OAK_WALL_SIGN_4 = new BlockState((short) 3739, Block.OAK_WALL_SIGN);

  public static final BlockState OAK_WALL_SIGN_5 = new BlockState((short) 3740, Block.OAK_WALL_SIGN);

  public static final BlockState OAK_WALL_SIGN_6 = new BlockState((short) 3741, Block.OAK_WALL_SIGN);

  public static final BlockState OAK_WALL_SIGN_7 = new BlockState((short) 3742, Block.OAK_WALL_SIGN);

  public static void initStates() {
    Block.OAK_WALL_SIGN.addBlockState(OAK_WALL_SIGN_0);
    Block.OAK_WALL_SIGN.addBlockState(OAK_WALL_SIGN_1);
    Block.OAK_WALL_SIGN.addBlockState(OAK_WALL_SIGN_2);
    Block.OAK_WALL_SIGN.addBlockState(OAK_WALL_SIGN_3);
    Block.OAK_WALL_SIGN.addBlockState(OAK_WALL_SIGN_4);
    Block.OAK_WALL_SIGN.addBlockState(OAK_WALL_SIGN_5);
    Block.OAK_WALL_SIGN.addBlockState(OAK_WALL_SIGN_6);
    Block.OAK_WALL_SIGN.addBlockState(OAK_WALL_SIGN_7);
  }
}
