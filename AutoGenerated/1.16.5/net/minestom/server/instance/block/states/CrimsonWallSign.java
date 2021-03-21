package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrimsonWallSign {
  public static final BlockState CRIMSON_WALL_SIGN_0 = new BlockState((short) 15727, Block.CRIMSON_WALL_SIGN);

  public static final BlockState CRIMSON_WALL_SIGN_1 = new BlockState((short) 15728, Block.CRIMSON_WALL_SIGN);

  public static final BlockState CRIMSON_WALL_SIGN_2 = new BlockState((short) 15729, Block.CRIMSON_WALL_SIGN);

  public static final BlockState CRIMSON_WALL_SIGN_3 = new BlockState((short) 15730, Block.CRIMSON_WALL_SIGN);

  public static final BlockState CRIMSON_WALL_SIGN_4 = new BlockState((short) 15731, Block.CRIMSON_WALL_SIGN);

  public static final BlockState CRIMSON_WALL_SIGN_5 = new BlockState((short) 15732, Block.CRIMSON_WALL_SIGN);

  public static final BlockState CRIMSON_WALL_SIGN_6 = new BlockState((short) 15733, Block.CRIMSON_WALL_SIGN);

  public static final BlockState CRIMSON_WALL_SIGN_7 = new BlockState((short) 15734, Block.CRIMSON_WALL_SIGN);

  public static void initStates() {
    Block.CRIMSON_WALL_SIGN.addBlockState(CRIMSON_WALL_SIGN_0);
    Block.CRIMSON_WALL_SIGN.addBlockState(CRIMSON_WALL_SIGN_1);
    Block.CRIMSON_WALL_SIGN.addBlockState(CRIMSON_WALL_SIGN_2);
    Block.CRIMSON_WALL_SIGN.addBlockState(CRIMSON_WALL_SIGN_3);
    Block.CRIMSON_WALL_SIGN.addBlockState(CRIMSON_WALL_SIGN_4);
    Block.CRIMSON_WALL_SIGN.addBlockState(CRIMSON_WALL_SIGN_5);
    Block.CRIMSON_WALL_SIGN.addBlockState(CRIMSON_WALL_SIGN_6);
    Block.CRIMSON_WALL_SIGN.addBlockState(CRIMSON_WALL_SIGN_7);
  }
}
