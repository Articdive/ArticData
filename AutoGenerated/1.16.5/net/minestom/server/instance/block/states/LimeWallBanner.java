package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LimeWallBanner {
  public static final BlockState LIME_WALL_BANNER_0 = new BlockState((short) 8177, Block.LIME_WALL_BANNER);

  public static final BlockState LIME_WALL_BANNER_1 = new BlockState((short) 8178, Block.LIME_WALL_BANNER);

  public static final BlockState LIME_WALL_BANNER_2 = new BlockState((short) 8179, Block.LIME_WALL_BANNER);

  public static final BlockState LIME_WALL_BANNER_3 = new BlockState((short) 8180, Block.LIME_WALL_BANNER);

  public static void initStates() {
    Block.LIME_WALL_BANNER.addBlockState(LIME_WALL_BANNER_0);
    Block.LIME_WALL_BANNER.addBlockState(LIME_WALL_BANNER_1);
    Block.LIME_WALL_BANNER.addBlockState(LIME_WALL_BANNER_2);
    Block.LIME_WALL_BANNER.addBlockState(LIME_WALL_BANNER_3);
  }
}
