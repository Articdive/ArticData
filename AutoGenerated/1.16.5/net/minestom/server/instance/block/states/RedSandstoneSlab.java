package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedSandstoneSlab {
  public static final BlockState RED_SANDSTONE_SLAB_0 = new BlockState((short) 8400, Block.RED_SANDSTONE_SLAB);

  public static final BlockState RED_SANDSTONE_SLAB_1 = new BlockState((short) 8401, Block.RED_SANDSTONE_SLAB);

  public static final BlockState RED_SANDSTONE_SLAB_2 = new BlockState((short) 8402, Block.RED_SANDSTONE_SLAB);

  public static final BlockState RED_SANDSTONE_SLAB_3 = new BlockState((short) 8403, Block.RED_SANDSTONE_SLAB);

  public static final BlockState RED_SANDSTONE_SLAB_4 = new BlockState((short) 8404, Block.RED_SANDSTONE_SLAB);

  public static final BlockState RED_SANDSTONE_SLAB_5 = new BlockState((short) 8405, Block.RED_SANDSTONE_SLAB);

  public static void initStates() {
    Block.RED_SANDSTONE_SLAB.addBlockState(RED_SANDSTONE_SLAB_0);
    Block.RED_SANDSTONE_SLAB.addBlockState(RED_SANDSTONE_SLAB_1);
    Block.RED_SANDSTONE_SLAB.addBlockState(RED_SANDSTONE_SLAB_2);
    Block.RED_SANDSTONE_SLAB.addBlockState(RED_SANDSTONE_SLAB_3);
    Block.RED_SANDSTONE_SLAB.addBlockState(RED_SANDSTONE_SLAB_4);
    Block.RED_SANDSTONE_SLAB.addBlockState(RED_SANDSTONE_SLAB_5);
  }
}
