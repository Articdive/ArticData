package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class QuartzSlab {
  public static final BlockState QUARTZ_SLAB_0 = new BlockState((short) 8394, Block.QUARTZ_SLAB);

  public static final BlockState QUARTZ_SLAB_1 = new BlockState((short) 8395, Block.QUARTZ_SLAB);

  public static final BlockState QUARTZ_SLAB_2 = new BlockState((short) 8396, Block.QUARTZ_SLAB);

  public static final BlockState QUARTZ_SLAB_3 = new BlockState((short) 8397, Block.QUARTZ_SLAB);

  public static final BlockState QUARTZ_SLAB_4 = new BlockState((short) 8398, Block.QUARTZ_SLAB);

  public static final BlockState QUARTZ_SLAB_5 = new BlockState((short) 8399, Block.QUARTZ_SLAB);

  public static void initStates() {
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_0);
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_1);
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_2);
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_3);
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_4);
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_5);
  }
}
