package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PinkWallBanner {
  public static final BlockState PINK_WALL_BANNER_0 = new BlockState((short) 8181, Block.PINK_WALL_BANNER);

  public static final BlockState PINK_WALL_BANNER_1 = new BlockState((short) 8182, Block.PINK_WALL_BANNER);

  public static final BlockState PINK_WALL_BANNER_2 = new BlockState((short) 8183, Block.PINK_WALL_BANNER);

  public static final BlockState PINK_WALL_BANNER_3 = new BlockState((short) 8184, Block.PINK_WALL_BANNER);

  public static void initStates() {
    Block.PINK_WALL_BANNER.addBlockState(PINK_WALL_BANNER_0);
    Block.PINK_WALL_BANNER.addBlockState(PINK_WALL_BANNER_1);
    Block.PINK_WALL_BANNER.addBlockState(PINK_WALL_BANNER_2);
    Block.PINK_WALL_BANNER.addBlockState(PINK_WALL_BANNER_3);
  }
}
