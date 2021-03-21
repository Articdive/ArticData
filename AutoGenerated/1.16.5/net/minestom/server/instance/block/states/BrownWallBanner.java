package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownWallBanner {
  public static final BlockState BROWN_WALL_BANNER_0 = new BlockState((short) 8205, Block.BROWN_WALL_BANNER);

  public static final BlockState BROWN_WALL_BANNER_1 = new BlockState((short) 8206, Block.BROWN_WALL_BANNER);

  public static final BlockState BROWN_WALL_BANNER_2 = new BlockState((short) 8207, Block.BROWN_WALL_BANNER);

  public static final BlockState BROWN_WALL_BANNER_3 = new BlockState((short) 8208, Block.BROWN_WALL_BANNER);

  public static void initStates() {
    Block.BROWN_WALL_BANNER.addBlockState(BROWN_WALL_BANNER_0);
    Block.BROWN_WALL_BANNER.addBlockState(BROWN_WALL_BANNER_1);
    Block.BROWN_WALL_BANNER.addBlockState(BROWN_WALL_BANNER_2);
    Block.BROWN_WALL_BANNER.addBlockState(BROWN_WALL_BANNER_3);
  }
}
