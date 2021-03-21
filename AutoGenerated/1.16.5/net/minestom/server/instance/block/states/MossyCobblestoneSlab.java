package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MossyCobblestoneSlab {
  public static final BlockState MOSSY_COBBLESTONE_SLAB_0 = new BlockState((short) 10817, Block.MOSSY_COBBLESTONE_SLAB);

  public static final BlockState MOSSY_COBBLESTONE_SLAB_1 = new BlockState((short) 10818, Block.MOSSY_COBBLESTONE_SLAB);

  public static final BlockState MOSSY_COBBLESTONE_SLAB_2 = new BlockState((short) 10819, Block.MOSSY_COBBLESTONE_SLAB);

  public static final BlockState MOSSY_COBBLESTONE_SLAB_3 = new BlockState((short) 10820, Block.MOSSY_COBBLESTONE_SLAB);

  public static final BlockState MOSSY_COBBLESTONE_SLAB_4 = new BlockState((short) 10821, Block.MOSSY_COBBLESTONE_SLAB);

  public static final BlockState MOSSY_COBBLESTONE_SLAB_5 = new BlockState((short) 10822, Block.MOSSY_COBBLESTONE_SLAB);

  public static void initStates() {
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_0);
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_1);
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_2);
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_3);
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_4);
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_5);
  }
}
