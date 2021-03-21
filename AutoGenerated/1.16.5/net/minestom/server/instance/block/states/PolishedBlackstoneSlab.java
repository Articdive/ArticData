package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedBlackstoneSlab {
  public static final BlockState POLISHED_BLACKSTONE_SLAB_0 = new BlockState((short) 16753, Block.POLISHED_BLACKSTONE_SLAB);

  public static final BlockState POLISHED_BLACKSTONE_SLAB_1 = new BlockState((short) 16754, Block.POLISHED_BLACKSTONE_SLAB);

  public static final BlockState POLISHED_BLACKSTONE_SLAB_2 = new BlockState((short) 16755, Block.POLISHED_BLACKSTONE_SLAB);

  public static final BlockState POLISHED_BLACKSTONE_SLAB_3 = new BlockState((short) 16756, Block.POLISHED_BLACKSTONE_SLAB);

  public static final BlockState POLISHED_BLACKSTONE_SLAB_4 = new BlockState((short) 16757, Block.POLISHED_BLACKSTONE_SLAB);

  public static final BlockState POLISHED_BLACKSTONE_SLAB_5 = new BlockState((short) 16758, Block.POLISHED_BLACKSTONE_SLAB);

  public static void initStates() {
    Block.POLISHED_BLACKSTONE_SLAB.addBlockState(POLISHED_BLACKSTONE_SLAB_0);
    Block.POLISHED_BLACKSTONE_SLAB.addBlockState(POLISHED_BLACKSTONE_SLAB_1);
    Block.POLISHED_BLACKSTONE_SLAB.addBlockState(POLISHED_BLACKSTONE_SLAB_2);
    Block.POLISHED_BLACKSTONE_SLAB.addBlockState(POLISHED_BLACKSTONE_SLAB_3);
    Block.POLISHED_BLACKSTONE_SLAB.addBlockState(POLISHED_BLACKSTONE_SLAB_4);
    Block.POLISHED_BLACKSTONE_SLAB.addBlockState(POLISHED_BLACKSTONE_SLAB_5);
  }
}
