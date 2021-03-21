package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WhiteWallBanner {
  public static final BlockState WHITE_WALL_BANNER_0 = new BlockState((short) 8157, Block.WHITE_WALL_BANNER);

  public static final BlockState WHITE_WALL_BANNER_1 = new BlockState((short) 8158, Block.WHITE_WALL_BANNER);

  public static final BlockState WHITE_WALL_BANNER_2 = new BlockState((short) 8159, Block.WHITE_WALL_BANNER);

  public static final BlockState WHITE_WALL_BANNER_3 = new BlockState((short) 8160, Block.WHITE_WALL_BANNER);

  public static void initStates() {
    Block.WHITE_WALL_BANNER.addBlockState(WHITE_WALL_BANNER_0);
    Block.WHITE_WALL_BANNER.addBlockState(WHITE_WALL_BANNER_1);
    Block.WHITE_WALL_BANNER.addBlockState(WHITE_WALL_BANNER_2);
    Block.WHITE_WALL_BANNER.addBlockState(WHITE_WALL_BANNER_3);
  }
}
