package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SpruceSlab {
  public static final BlockState SPRUCE_SLAB_0 = new BlockState((short) 8310, Block.SPRUCE_SLAB);

  public static final BlockState SPRUCE_SLAB_1 = new BlockState((short) 8311, Block.SPRUCE_SLAB);

  public static final BlockState SPRUCE_SLAB_2 = new BlockState((short) 8312, Block.SPRUCE_SLAB);

  public static final BlockState SPRUCE_SLAB_3 = new BlockState((short) 8313, Block.SPRUCE_SLAB);

  public static final BlockState SPRUCE_SLAB_4 = new BlockState((short) 8314, Block.SPRUCE_SLAB);

  public static final BlockState SPRUCE_SLAB_5 = new BlockState((short) 8315, Block.SPRUCE_SLAB);

  public static void initStates() {
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_0);
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_1);
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_2);
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_3);
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_4);
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_5);
  }
}
