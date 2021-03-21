package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpurSlab {
  public static final BlockState PURPUR_SLAB_0 = new BlockState((short) 8412, Block.PURPUR_SLAB);

  public static final BlockState PURPUR_SLAB_1 = new BlockState((short) 8413, Block.PURPUR_SLAB);

  public static final BlockState PURPUR_SLAB_2 = new BlockState((short) 8414, Block.PURPUR_SLAB);

  public static final BlockState PURPUR_SLAB_3 = new BlockState((short) 8415, Block.PURPUR_SLAB);

  public static final BlockState PURPUR_SLAB_4 = new BlockState((short) 8416, Block.PURPUR_SLAB);

  public static final BlockState PURPUR_SLAB_5 = new BlockState((short) 8417, Block.PURPUR_SLAB);

  public static void initStates() {
    Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_0);
    Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_1);
    Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_2);
    Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_3);
    Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_4);
    Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_5);
  }
}
