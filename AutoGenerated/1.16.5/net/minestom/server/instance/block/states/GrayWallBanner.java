package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrayWallBanner {
  public static final BlockState GRAY_WALL_BANNER_0 = new BlockState((short) 8185, Block.GRAY_WALL_BANNER);

  public static final BlockState GRAY_WALL_BANNER_1 = new BlockState((short) 8186, Block.GRAY_WALL_BANNER);

  public static final BlockState GRAY_WALL_BANNER_2 = new BlockState((short) 8187, Block.GRAY_WALL_BANNER);

  public static final BlockState GRAY_WALL_BANNER_3 = new BlockState((short) 8188, Block.GRAY_WALL_BANNER);

  public static void initStates() {
    Block.GRAY_WALL_BANNER.addBlockState(GRAY_WALL_BANNER_0);
    Block.GRAY_WALL_BANNER.addBlockState(GRAY_WALL_BANNER_1);
    Block.GRAY_WALL_BANNER.addBlockState(GRAY_WALL_BANNER_2);
    Block.GRAY_WALL_BANNER.addBlockState(GRAY_WALL_BANNER_3);
  }
}
