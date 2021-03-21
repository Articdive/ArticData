package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightGrayWallBanner {
  public static final BlockState LIGHT_GRAY_WALL_BANNER_0 = new BlockState((short) 8189, Block.LIGHT_GRAY_WALL_BANNER);

  public static final BlockState LIGHT_GRAY_WALL_BANNER_1 = new BlockState((short) 8190, Block.LIGHT_GRAY_WALL_BANNER);

  public static final BlockState LIGHT_GRAY_WALL_BANNER_2 = new BlockState((short) 8191, Block.LIGHT_GRAY_WALL_BANNER);

  public static final BlockState LIGHT_GRAY_WALL_BANNER_3 = new BlockState((short) 8192, Block.LIGHT_GRAY_WALL_BANNER);

  public static void initStates() {
    Block.LIGHT_GRAY_WALL_BANNER.addBlockState(LIGHT_GRAY_WALL_BANNER_0);
    Block.LIGHT_GRAY_WALL_BANNER.addBlockState(LIGHT_GRAY_WALL_BANNER_1);
    Block.LIGHT_GRAY_WALL_BANNER.addBlockState(LIGHT_GRAY_WALL_BANNER_2);
    Block.LIGHT_GRAY_WALL_BANNER.addBlockState(LIGHT_GRAY_WALL_BANNER_3);
  }
}
