package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DioriteSlab {
  public static final BlockState DIORITE_SLAB_0 = new BlockState((short) 10865, Block.DIORITE_SLAB);

  public static final BlockState DIORITE_SLAB_1 = new BlockState((short) 10866, Block.DIORITE_SLAB);

  public static final BlockState DIORITE_SLAB_2 = new BlockState((short) 10867, Block.DIORITE_SLAB);

  public static final BlockState DIORITE_SLAB_3 = new BlockState((short) 10868, Block.DIORITE_SLAB);

  public static final BlockState DIORITE_SLAB_4 = new BlockState((short) 10869, Block.DIORITE_SLAB);

  public static final BlockState DIORITE_SLAB_5 = new BlockState((short) 10870, Block.DIORITE_SLAB);

  public static void initStates() {
    Block.DIORITE_SLAB.addBlockState(DIORITE_SLAB_0);
    Block.DIORITE_SLAB.addBlockState(DIORITE_SLAB_1);
    Block.DIORITE_SLAB.addBlockState(DIORITE_SLAB_2);
    Block.DIORITE_SLAB.addBlockState(DIORITE_SLAB_3);
    Block.DIORITE_SLAB.addBlockState(DIORITE_SLAB_4);
    Block.DIORITE_SLAB.addBlockState(DIORITE_SLAB_5);
  }
}
