package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrimsonSlab {
  public static final BlockState CRIMSON_SLAB_0 = new BlockState((short) 15055, Block.CRIMSON_SLAB);

  public static final BlockState CRIMSON_SLAB_1 = new BlockState((short) 15056, Block.CRIMSON_SLAB);

  public static final BlockState CRIMSON_SLAB_2 = new BlockState((short) 15057, Block.CRIMSON_SLAB);

  public static final BlockState CRIMSON_SLAB_3 = new BlockState((short) 15058, Block.CRIMSON_SLAB);

  public static final BlockState CRIMSON_SLAB_4 = new BlockState((short) 15059, Block.CRIMSON_SLAB);

  public static final BlockState CRIMSON_SLAB_5 = new BlockState((short) 15060, Block.CRIMSON_SLAB);

  public static void initStates() {
    Block.CRIMSON_SLAB.addBlockState(CRIMSON_SLAB_0);
    Block.CRIMSON_SLAB.addBlockState(CRIMSON_SLAB_1);
    Block.CRIMSON_SLAB.addBlockState(CRIMSON_SLAB_2);
    Block.CRIMSON_SLAB.addBlockState(CRIMSON_SLAB_3);
    Block.CRIMSON_SLAB.addBlockState(CRIMSON_SLAB_4);
    Block.CRIMSON_SLAB.addBlockState(CRIMSON_SLAB_5);
  }
}
