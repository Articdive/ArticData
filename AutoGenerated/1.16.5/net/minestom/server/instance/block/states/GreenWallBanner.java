package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GreenWallBanner {
  public static final BlockState GREEN_WALL_BANNER_0 = new BlockState((short) 8209, Block.GREEN_WALL_BANNER);

  public static final BlockState GREEN_WALL_BANNER_1 = new BlockState((short) 8210, Block.GREEN_WALL_BANNER);

  public static final BlockState GREEN_WALL_BANNER_2 = new BlockState((short) 8211, Block.GREEN_WALL_BANNER);

  public static final BlockState GREEN_WALL_BANNER_3 = new BlockState((short) 8212, Block.GREEN_WALL_BANNER);

  public static void initStates() {
    Block.GREEN_WALL_BANNER.addBlockState(GREEN_WALL_BANNER_0);
    Block.GREEN_WALL_BANNER.addBlockState(GREEN_WALL_BANNER_1);
    Block.GREEN_WALL_BANNER.addBlockState(GREEN_WALL_BANNER_2);
    Block.GREEN_WALL_BANNER.addBlockState(GREEN_WALL_BANNER_3);
  }
}
