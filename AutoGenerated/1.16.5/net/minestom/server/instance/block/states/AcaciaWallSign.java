package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AcaciaWallSign {
  public static final BlockState ACACIA_WALL_SIGN_0 = new BlockState((short) 3759, Block.ACACIA_WALL_SIGN);

  public static final BlockState ACACIA_WALL_SIGN_1 = new BlockState((short) 3760, Block.ACACIA_WALL_SIGN);

  public static final BlockState ACACIA_WALL_SIGN_2 = new BlockState((short) 3761, Block.ACACIA_WALL_SIGN);

  public static final BlockState ACACIA_WALL_SIGN_3 = new BlockState((short) 3762, Block.ACACIA_WALL_SIGN);

  public static final BlockState ACACIA_WALL_SIGN_4 = new BlockState((short) 3763, Block.ACACIA_WALL_SIGN);

  public static final BlockState ACACIA_WALL_SIGN_5 = new BlockState((short) 3764, Block.ACACIA_WALL_SIGN);

  public static final BlockState ACACIA_WALL_SIGN_6 = new BlockState((short) 3765, Block.ACACIA_WALL_SIGN);

  public static final BlockState ACACIA_WALL_SIGN_7 = new BlockState((short) 3766, Block.ACACIA_WALL_SIGN);

  public static void initStates() {
    Block.ACACIA_WALL_SIGN.addBlockState(ACACIA_WALL_SIGN_0);
    Block.ACACIA_WALL_SIGN.addBlockState(ACACIA_WALL_SIGN_1);
    Block.ACACIA_WALL_SIGN.addBlockState(ACACIA_WALL_SIGN_2);
    Block.ACACIA_WALL_SIGN.addBlockState(ACACIA_WALL_SIGN_3);
    Block.ACACIA_WALL_SIGN.addBlockState(ACACIA_WALL_SIGN_4);
    Block.ACACIA_WALL_SIGN.addBlockState(ACACIA_WALL_SIGN_5);
    Block.ACACIA_WALL_SIGN.addBlockState(ACACIA_WALL_SIGN_6);
    Block.ACACIA_WALL_SIGN.addBlockState(ACACIA_WALL_SIGN_7);
  }
}
