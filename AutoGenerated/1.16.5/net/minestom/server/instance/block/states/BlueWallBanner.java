package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlueWallBanner {
  public static final BlockState BLUE_WALL_BANNER_0 = new BlockState((short) 8201, Block.BLUE_WALL_BANNER);

  public static final BlockState BLUE_WALL_BANNER_1 = new BlockState((short) 8202, Block.BLUE_WALL_BANNER);

  public static final BlockState BLUE_WALL_BANNER_2 = new BlockState((short) 8203, Block.BLUE_WALL_BANNER);

  public static final BlockState BLUE_WALL_BANNER_3 = new BlockState((short) 8204, Block.BLUE_WALL_BANNER);

  public static void initStates() {
    Block.BLUE_WALL_BANNER.addBlockState(BLUE_WALL_BANNER_0);
    Block.BLUE_WALL_BANNER.addBlockState(BLUE_WALL_BANNER_1);
    Block.BLUE_WALL_BANNER.addBlockState(BLUE_WALL_BANNER_2);
    Block.BLUE_WALL_BANNER.addBlockState(BLUE_WALL_BANNER_3);
  }
}
