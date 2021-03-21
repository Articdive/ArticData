package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class JungleWallSign {
  public static final BlockState JUNGLE_WALL_SIGN_0 = new BlockState((short) 3767, Block.JUNGLE_WALL_SIGN);

  public static final BlockState JUNGLE_WALL_SIGN_1 = new BlockState((short) 3768, Block.JUNGLE_WALL_SIGN);

  public static final BlockState JUNGLE_WALL_SIGN_2 = new BlockState((short) 3769, Block.JUNGLE_WALL_SIGN);

  public static final BlockState JUNGLE_WALL_SIGN_3 = new BlockState((short) 3770, Block.JUNGLE_WALL_SIGN);

  public static final BlockState JUNGLE_WALL_SIGN_4 = new BlockState((short) 3771, Block.JUNGLE_WALL_SIGN);

  public static final BlockState JUNGLE_WALL_SIGN_5 = new BlockState((short) 3772, Block.JUNGLE_WALL_SIGN);

  public static final BlockState JUNGLE_WALL_SIGN_6 = new BlockState((short) 3773, Block.JUNGLE_WALL_SIGN);

  public static final BlockState JUNGLE_WALL_SIGN_7 = new BlockState((short) 3774, Block.JUNGLE_WALL_SIGN);

  public static void initStates() {
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_0);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_1);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_2);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_3);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_4);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_5);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_6);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_7);
  }
}
