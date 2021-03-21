package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DragonWallHead {
  public static final BlockState DRAGON_WALL_HEAD_0 = new BlockState((short) 6610, Block.DRAGON_WALL_HEAD);

  public static final BlockState DRAGON_WALL_HEAD_1 = new BlockState((short) 6611, Block.DRAGON_WALL_HEAD);

  public static final BlockState DRAGON_WALL_HEAD_2 = new BlockState((short) 6612, Block.DRAGON_WALL_HEAD);

  public static final BlockState DRAGON_WALL_HEAD_3 = new BlockState((short) 6613, Block.DRAGON_WALL_HEAD);

  public static void initStates() {
    Block.DRAGON_WALL_HEAD.addBlockState(DRAGON_WALL_HEAD_0);
    Block.DRAGON_WALL_HEAD.addBlockState(DRAGON_WALL_HEAD_1);
    Block.DRAGON_WALL_HEAD.addBlockState(DRAGON_WALL_HEAD_2);
    Block.DRAGON_WALL_HEAD.addBlockState(DRAGON_WALL_HEAD_3);
  }
}
