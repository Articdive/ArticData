package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CreeperWallHead {
  public static final BlockState CREEPER_WALL_HEAD_0 = new BlockState((short) 6590, Block.CREEPER_WALL_HEAD);

  public static final BlockState CREEPER_WALL_HEAD_1 = new BlockState((short) 6591, Block.CREEPER_WALL_HEAD);

  public static final BlockState CREEPER_WALL_HEAD_2 = new BlockState((short) 6592, Block.CREEPER_WALL_HEAD);

  public static final BlockState CREEPER_WALL_HEAD_3 = new BlockState((short) 6593, Block.CREEPER_WALL_HEAD);

  public static void initStates() {
    Block.CREEPER_WALL_HEAD.addBlockState(CREEPER_WALL_HEAD_0);
    Block.CREEPER_WALL_HEAD.addBlockState(CREEPER_WALL_HEAD_1);
    Block.CREEPER_WALL_HEAD.addBlockState(CREEPER_WALL_HEAD_2);
    Block.CREEPER_WALL_HEAD.addBlockState(CREEPER_WALL_HEAD_3);
  }
}
