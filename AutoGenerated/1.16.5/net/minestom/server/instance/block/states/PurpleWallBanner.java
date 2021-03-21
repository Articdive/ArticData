package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpleWallBanner {
  public static final BlockState PURPLE_WALL_BANNER_0 = new BlockState((short) 8197, Block.PURPLE_WALL_BANNER);

  public static final BlockState PURPLE_WALL_BANNER_1 = new BlockState((short) 8198, Block.PURPLE_WALL_BANNER);

  public static final BlockState PURPLE_WALL_BANNER_2 = new BlockState((short) 8199, Block.PURPLE_WALL_BANNER);

  public static final BlockState PURPLE_WALL_BANNER_3 = new BlockState((short) 8200, Block.PURPLE_WALL_BANNER);

  public static void initStates() {
    Block.PURPLE_WALL_BANNER.addBlockState(PURPLE_WALL_BANNER_0);
    Block.PURPLE_WALL_BANNER.addBlockState(PURPLE_WALL_BANNER_1);
    Block.PURPLE_WALL_BANNER.addBlockState(PURPLE_WALL_BANNER_2);
    Block.PURPLE_WALL_BANNER.addBlockState(PURPLE_WALL_BANNER_3);
  }
}
