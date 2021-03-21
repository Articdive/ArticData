package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class YellowWallBanner {
  public static final BlockState YELLOW_WALL_BANNER_0 = new BlockState((short) 8173, Block.YELLOW_WALL_BANNER);

  public static final BlockState YELLOW_WALL_BANNER_1 = new BlockState((short) 8174, Block.YELLOW_WALL_BANNER);

  public static final BlockState YELLOW_WALL_BANNER_2 = new BlockState((short) 8175, Block.YELLOW_WALL_BANNER);

  public static final BlockState YELLOW_WALL_BANNER_3 = new BlockState((short) 8176, Block.YELLOW_WALL_BANNER);

  public static void initStates() {
    Block.YELLOW_WALL_BANNER.addBlockState(YELLOW_WALL_BANNER_0);
    Block.YELLOW_WALL_BANNER.addBlockState(YELLOW_WALL_BANNER_1);
    Block.YELLOW_WALL_BANNER.addBlockState(YELLOW_WALL_BANNER_2);
    Block.YELLOW_WALL_BANNER.addBlockState(YELLOW_WALL_BANNER_3);
  }
}
