package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedSpruceWood {
  public static final BlockState STRIPPED_SPRUCE_WOOD_0 = new BlockState((short) 130, Block.STRIPPED_SPRUCE_WOOD);

  public static final BlockState STRIPPED_SPRUCE_WOOD_1 = new BlockState((short) 131, Block.STRIPPED_SPRUCE_WOOD);

  public static final BlockState STRIPPED_SPRUCE_WOOD_2 = new BlockState((short) 132, Block.STRIPPED_SPRUCE_WOOD);

  public static void initStates() {
    Block.STRIPPED_SPRUCE_WOOD.addBlockState(STRIPPED_SPRUCE_WOOD_0);
    Block.STRIPPED_SPRUCE_WOOD.addBlockState(STRIPPED_SPRUCE_WOOD_1);
    Block.STRIPPED_SPRUCE_WOOD.addBlockState(STRIPPED_SPRUCE_WOOD_2);
  }
}
