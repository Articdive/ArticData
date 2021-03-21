package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedDioriteSlab {
  public static final BlockState POLISHED_DIORITE_SLAB_0 = new BlockState((short) 10811, Block.POLISHED_DIORITE_SLAB);

  public static final BlockState POLISHED_DIORITE_SLAB_1 = new BlockState((short) 10812, Block.POLISHED_DIORITE_SLAB);

  public static final BlockState POLISHED_DIORITE_SLAB_2 = new BlockState((short) 10813, Block.POLISHED_DIORITE_SLAB);

  public static final BlockState POLISHED_DIORITE_SLAB_3 = new BlockState((short) 10814, Block.POLISHED_DIORITE_SLAB);

  public static final BlockState POLISHED_DIORITE_SLAB_4 = new BlockState((short) 10815, Block.POLISHED_DIORITE_SLAB);

  public static final BlockState POLISHED_DIORITE_SLAB_5 = new BlockState((short) 10816, Block.POLISHED_DIORITE_SLAB);

  public static void initStates() {
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_0);
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_1);
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_2);
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_3);
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_4);
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_5);
  }
}
