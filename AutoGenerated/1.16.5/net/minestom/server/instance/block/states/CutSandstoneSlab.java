package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CutSandstoneSlab {
  public static final BlockState CUT_SANDSTONE_SLAB_0 = new BlockState((short) 8358, Block.CUT_SANDSTONE_SLAB);

  public static final BlockState CUT_SANDSTONE_SLAB_1 = new BlockState((short) 8359, Block.CUT_SANDSTONE_SLAB);

  public static final BlockState CUT_SANDSTONE_SLAB_2 = new BlockState((short) 8360, Block.CUT_SANDSTONE_SLAB);

  public static final BlockState CUT_SANDSTONE_SLAB_3 = new BlockState((short) 8361, Block.CUT_SANDSTONE_SLAB);

  public static final BlockState CUT_SANDSTONE_SLAB_4 = new BlockState((short) 8362, Block.CUT_SANDSTONE_SLAB);

  public static final BlockState CUT_SANDSTONE_SLAB_5 = new BlockState((short) 8363, Block.CUT_SANDSTONE_SLAB);

  public static void initStates() {
    Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_0);
    Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_1);
    Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_2);
    Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_3);
    Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_4);
    Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_5);
  }
}
