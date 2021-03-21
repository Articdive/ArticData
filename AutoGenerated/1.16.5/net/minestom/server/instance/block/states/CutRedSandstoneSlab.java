package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CutRedSandstoneSlab {
  public static final BlockState CUT_RED_SANDSTONE_SLAB_0 = new BlockState((short) 8406, Block.CUT_RED_SANDSTONE_SLAB);

  public static final BlockState CUT_RED_SANDSTONE_SLAB_1 = new BlockState((short) 8407, Block.CUT_RED_SANDSTONE_SLAB);

  public static final BlockState CUT_RED_SANDSTONE_SLAB_2 = new BlockState((short) 8408, Block.CUT_RED_SANDSTONE_SLAB);

  public static final BlockState CUT_RED_SANDSTONE_SLAB_3 = new BlockState((short) 8409, Block.CUT_RED_SANDSTONE_SLAB);

  public static final BlockState CUT_RED_SANDSTONE_SLAB_4 = new BlockState((short) 8410, Block.CUT_RED_SANDSTONE_SLAB);

  public static final BlockState CUT_RED_SANDSTONE_SLAB_5 = new BlockState((short) 8411, Block.CUT_RED_SANDSTONE_SLAB);

  public static void initStates() {
    Block.CUT_RED_SANDSTONE_SLAB.addBlockState(CUT_RED_SANDSTONE_SLAB_0);
    Block.CUT_RED_SANDSTONE_SLAB.addBlockState(CUT_RED_SANDSTONE_SLAB_1);
    Block.CUT_RED_SANDSTONE_SLAB.addBlockState(CUT_RED_SANDSTONE_SLAB_2);
    Block.CUT_RED_SANDSTONE_SLAB.addBlockState(CUT_RED_SANDSTONE_SLAB_3);
    Block.CUT_RED_SANDSTONE_SLAB.addBlockState(CUT_RED_SANDSTONE_SLAB_4);
    Block.CUT_RED_SANDSTONE_SLAB.addBlockState(CUT_RED_SANDSTONE_SLAB_5);
  }
}
