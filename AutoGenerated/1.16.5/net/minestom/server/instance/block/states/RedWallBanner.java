package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedWallBanner {
  public static final BlockState RED_WALL_BANNER_0 = new BlockState((short) 8213, Block.RED_WALL_BANNER);

  public static final BlockState RED_WALL_BANNER_1 = new BlockState((short) 8214, Block.RED_WALL_BANNER);

  public static final BlockState RED_WALL_BANNER_2 = new BlockState((short) 8215, Block.RED_WALL_BANNER);

  public static final BlockState RED_WALL_BANNER_3 = new BlockState((short) 8216, Block.RED_WALL_BANNER);

  public static void initStates() {
    Block.RED_WALL_BANNER.addBlockState(RED_WALL_BANNER_0);
    Block.RED_WALL_BANNER.addBlockState(RED_WALL_BANNER_1);
    Block.RED_WALL_BANNER.addBlockState(RED_WALL_BANNER_2);
    Block.RED_WALL_BANNER.addBlockState(RED_WALL_BANNER_3);
  }
}
