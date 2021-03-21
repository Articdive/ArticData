package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SpruceWallSign {
  public static final BlockState SPRUCE_WALL_SIGN_0 = new BlockState((short) 3743, Block.SPRUCE_WALL_SIGN);

  public static final BlockState SPRUCE_WALL_SIGN_1 = new BlockState((short) 3744, Block.SPRUCE_WALL_SIGN);

  public static final BlockState SPRUCE_WALL_SIGN_2 = new BlockState((short) 3745, Block.SPRUCE_WALL_SIGN);

  public static final BlockState SPRUCE_WALL_SIGN_3 = new BlockState((short) 3746, Block.SPRUCE_WALL_SIGN);

  public static final BlockState SPRUCE_WALL_SIGN_4 = new BlockState((short) 3747, Block.SPRUCE_WALL_SIGN);

  public static final BlockState SPRUCE_WALL_SIGN_5 = new BlockState((short) 3748, Block.SPRUCE_WALL_SIGN);

  public static final BlockState SPRUCE_WALL_SIGN_6 = new BlockState((short) 3749, Block.SPRUCE_WALL_SIGN);

  public static final BlockState SPRUCE_WALL_SIGN_7 = new BlockState((short) 3750, Block.SPRUCE_WALL_SIGN);

  public static void initStates() {
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_0);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_1);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_2);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_3);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_4);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_5);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_6);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_7);
  }
}
