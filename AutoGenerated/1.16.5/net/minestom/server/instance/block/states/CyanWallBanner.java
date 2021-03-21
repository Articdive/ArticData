package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CyanWallBanner {
  public static final BlockState CYAN_WALL_BANNER_0 = new BlockState((short) 8193, Block.CYAN_WALL_BANNER);

  public static final BlockState CYAN_WALL_BANNER_1 = new BlockState((short) 8194, Block.CYAN_WALL_BANNER);

  public static final BlockState CYAN_WALL_BANNER_2 = new BlockState((short) 8195, Block.CYAN_WALL_BANNER);

  public static final BlockState CYAN_WALL_BANNER_3 = new BlockState((short) 8196, Block.CYAN_WALL_BANNER);

  public static void initStates() {
    Block.CYAN_WALL_BANNER.addBlockState(CYAN_WALL_BANNER_0);
    Block.CYAN_WALL_BANNER.addBlockState(CYAN_WALL_BANNER_1);
    Block.CYAN_WALL_BANNER.addBlockState(CYAN_WALL_BANNER_2);
    Block.CYAN_WALL_BANNER.addBlockState(CYAN_WALL_BANNER_3);
  }
}
