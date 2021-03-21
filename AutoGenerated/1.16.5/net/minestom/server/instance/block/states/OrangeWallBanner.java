package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OrangeWallBanner {
  public static final BlockState ORANGE_WALL_BANNER_0 = new BlockState((short) 8161, Block.ORANGE_WALL_BANNER);

  public static final BlockState ORANGE_WALL_BANNER_1 = new BlockState((short) 8162, Block.ORANGE_WALL_BANNER);

  public static final BlockState ORANGE_WALL_BANNER_2 = new BlockState((short) 8163, Block.ORANGE_WALL_BANNER);

  public static final BlockState ORANGE_WALL_BANNER_3 = new BlockState((short) 8164, Block.ORANGE_WALL_BANNER);

  public static void initStates() {
    Block.ORANGE_WALL_BANNER.addBlockState(ORANGE_WALL_BANNER_0);
    Block.ORANGE_WALL_BANNER.addBlockState(ORANGE_WALL_BANNER_1);
    Block.ORANGE_WALL_BANNER.addBlockState(ORANGE_WALL_BANNER_2);
    Block.ORANGE_WALL_BANNER.addBlockState(ORANGE_WALL_BANNER_3);
  }
}
