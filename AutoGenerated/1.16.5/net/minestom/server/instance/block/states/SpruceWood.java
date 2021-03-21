package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SpruceWood {
  public static final BlockState SPRUCE_WOOD_0 = new BlockState((short) 112, Block.SPRUCE_WOOD);

  public static final BlockState SPRUCE_WOOD_1 = new BlockState((short) 113, Block.SPRUCE_WOOD);

  public static final BlockState SPRUCE_WOOD_2 = new BlockState((short) 114, Block.SPRUCE_WOOD);

  public static void initStates() {
    Block.SPRUCE_WOOD.addBlockState(SPRUCE_WOOD_0);
    Block.SPRUCE_WOOD.addBlockState(SPRUCE_WOOD_1);
    Block.SPRUCE_WOOD.addBlockState(SPRUCE_WOOD_2);
  }
}
