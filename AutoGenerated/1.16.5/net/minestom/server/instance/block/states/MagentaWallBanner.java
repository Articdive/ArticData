package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MagentaWallBanner {
  public static final BlockState MAGENTA_WALL_BANNER_0 = new BlockState((short) 8165, Block.MAGENTA_WALL_BANNER);

  public static final BlockState MAGENTA_WALL_BANNER_1 = new BlockState((short) 8166, Block.MAGENTA_WALL_BANNER);

  public static final BlockState MAGENTA_WALL_BANNER_2 = new BlockState((short) 8167, Block.MAGENTA_WALL_BANNER);

  public static final BlockState MAGENTA_WALL_BANNER_3 = new BlockState((short) 8168, Block.MAGENTA_WALL_BANNER);

  public static void initStates() {
    Block.MAGENTA_WALL_BANNER.addBlockState(MAGENTA_WALL_BANNER_0);
    Block.MAGENTA_WALL_BANNER.addBlockState(MAGENTA_WALL_BANNER_1);
    Block.MAGENTA_WALL_BANNER.addBlockState(MAGENTA_WALL_BANNER_2);
    Block.MAGENTA_WALL_BANNER.addBlockState(MAGENTA_WALL_BANNER_3);
  }
}
