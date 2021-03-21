package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WarpedSlab {
  public static final BlockState WARPED_SLAB_0 = new BlockState((short) 15061, Block.WARPED_SLAB);

  public static final BlockState WARPED_SLAB_1 = new BlockState((short) 15062, Block.WARPED_SLAB);

  public static final BlockState WARPED_SLAB_2 = new BlockState((short) 15063, Block.WARPED_SLAB);

  public static final BlockState WARPED_SLAB_3 = new BlockState((short) 15064, Block.WARPED_SLAB);

  public static final BlockState WARPED_SLAB_4 = new BlockState((short) 15065, Block.WARPED_SLAB);

  public static final BlockState WARPED_SLAB_5 = new BlockState((short) 15066, Block.WARPED_SLAB);

  public static void initStates() {
    Block.WARPED_SLAB.addBlockState(WARPED_SLAB_0);
    Block.WARPED_SLAB.addBlockState(WARPED_SLAB_1);
    Block.WARPED_SLAB.addBlockState(WARPED_SLAB_2);
    Block.WARPED_SLAB.addBlockState(WARPED_SLAB_3);
    Block.WARPED_SLAB.addBlockState(WARPED_SLAB_4);
    Block.WARPED_SLAB.addBlockState(WARPED_SLAB_5);
  }
}
