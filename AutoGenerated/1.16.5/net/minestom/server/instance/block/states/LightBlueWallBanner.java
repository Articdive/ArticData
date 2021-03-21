package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightBlueWallBanner {
  public static final BlockState LIGHT_BLUE_WALL_BANNER_0 = new BlockState((short) 8169, Block.LIGHT_BLUE_WALL_BANNER);

  public static final BlockState LIGHT_BLUE_WALL_BANNER_1 = new BlockState((short) 8170, Block.LIGHT_BLUE_WALL_BANNER);

  public static final BlockState LIGHT_BLUE_WALL_BANNER_2 = new BlockState((short) 8171, Block.LIGHT_BLUE_WALL_BANNER);

  public static final BlockState LIGHT_BLUE_WALL_BANNER_3 = new BlockState((short) 8172, Block.LIGHT_BLUE_WALL_BANNER);

  public static void initStates() {
    Block.LIGHT_BLUE_WALL_BANNER.addBlockState(LIGHT_BLUE_WALL_BANNER_0);
    Block.LIGHT_BLUE_WALL_BANNER.addBlockState(LIGHT_BLUE_WALL_BANNER_1);
    Block.LIGHT_BLUE_WALL_BANNER.addBlockState(LIGHT_BLUE_WALL_BANNER_2);
    Block.LIGHT_BLUE_WALL_BANNER.addBlockState(LIGHT_BLUE_WALL_BANNER_3);
  }
}
