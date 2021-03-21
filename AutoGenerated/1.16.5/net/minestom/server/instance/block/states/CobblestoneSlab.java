package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CobblestoneSlab {
  public static final BlockState COBBLESTONE_SLAB_0 = new BlockState((short) 8370, Block.COBBLESTONE_SLAB);

  public static final BlockState COBBLESTONE_SLAB_1 = new BlockState((short) 8371, Block.COBBLESTONE_SLAB);

  public static final BlockState COBBLESTONE_SLAB_2 = new BlockState((short) 8372, Block.COBBLESTONE_SLAB);

  public static final BlockState COBBLESTONE_SLAB_3 = new BlockState((short) 8373, Block.COBBLESTONE_SLAB);

  public static final BlockState COBBLESTONE_SLAB_4 = new BlockState((short) 8374, Block.COBBLESTONE_SLAB);

  public static final BlockState COBBLESTONE_SLAB_5 = new BlockState((short) 8375, Block.COBBLESTONE_SLAB);

  public static void initStates() {
    Block.COBBLESTONE_SLAB.addBlockState(COBBLESTONE_SLAB_0);
    Block.COBBLESTONE_SLAB.addBlockState(COBBLESTONE_SLAB_1);
    Block.COBBLESTONE_SLAB.addBlockState(COBBLESTONE_SLAB_2);
    Block.COBBLESTONE_SLAB.addBlockState(COBBLESTONE_SLAB_3);
    Block.COBBLESTONE_SLAB.addBlockState(COBBLESTONE_SLAB_4);
    Block.COBBLESTONE_SLAB.addBlockState(COBBLESTONE_SLAB_5);
  }
}
