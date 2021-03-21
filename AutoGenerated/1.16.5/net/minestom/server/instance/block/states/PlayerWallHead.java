package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PlayerWallHead {
  public static final BlockState PLAYER_WALL_HEAD_0 = new BlockState((short) 6570, Block.PLAYER_WALL_HEAD);

  public static final BlockState PLAYER_WALL_HEAD_1 = new BlockState((short) 6571, Block.PLAYER_WALL_HEAD);

  public static final BlockState PLAYER_WALL_HEAD_2 = new BlockState((short) 6572, Block.PLAYER_WALL_HEAD);

  public static final BlockState PLAYER_WALL_HEAD_3 = new BlockState((short) 6573, Block.PLAYER_WALL_HEAD);

  public static void initStates() {
    Block.PLAYER_WALL_HEAD.addBlockState(PLAYER_WALL_HEAD_0);
    Block.PLAYER_WALL_HEAD.addBlockState(PLAYER_WALL_HEAD_1);
    Block.PLAYER_WALL_HEAD.addBlockState(PLAYER_WALL_HEAD_2);
    Block.PLAYER_WALL_HEAD.addBlockState(PLAYER_WALL_HEAD_3);
  }
}
