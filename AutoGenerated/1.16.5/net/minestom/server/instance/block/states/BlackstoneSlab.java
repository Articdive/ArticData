package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlackstoneSlab {
  public static final BlockState BLACKSTONE_SLAB_0 = new BlockState((short) 16252, Block.BLACKSTONE_SLAB);

  public static final BlockState BLACKSTONE_SLAB_1 = new BlockState((short) 16253, Block.BLACKSTONE_SLAB);

  public static final BlockState BLACKSTONE_SLAB_2 = new BlockState((short) 16254, Block.BLACKSTONE_SLAB);

  public static final BlockState BLACKSTONE_SLAB_3 = new BlockState((short) 16255, Block.BLACKSTONE_SLAB);

  public static final BlockState BLACKSTONE_SLAB_4 = new BlockState((short) 16256, Block.BLACKSTONE_SLAB);

  public static final BlockState BLACKSTONE_SLAB_5 = new BlockState((short) 16257, Block.BLACKSTONE_SLAB);

  public static void initStates() {
    Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_0);
    Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_1);
    Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_2);
    Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_3);
    Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_4);
    Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_5);
  }
}
