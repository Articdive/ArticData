package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlackWallBanner {
  public static final BlockState BLACK_WALL_BANNER_0 = new BlockState((short) 8217, Block.BLACK_WALL_BANNER);

  public static final BlockState BLACK_WALL_BANNER_1 = new BlockState((short) 8218, Block.BLACK_WALL_BANNER);

  public static final BlockState BLACK_WALL_BANNER_2 = new BlockState((short) 8219, Block.BLACK_WALL_BANNER);

  public static final BlockState BLACK_WALL_BANNER_3 = new BlockState((short) 8220, Block.BLACK_WALL_BANNER);

  public static void initStates() {
    Block.BLACK_WALL_BANNER.addBlockState(BLACK_WALL_BANNER_0);
    Block.BLACK_WALL_BANNER.addBlockState(BLACK_WALL_BANNER_1);
    Block.BLACK_WALL_BANNER.addBlockState(BLACK_WALL_BANNER_2);
    Block.BLACK_WALL_BANNER.addBlockState(BLACK_WALL_BANNER_3);
  }
}
