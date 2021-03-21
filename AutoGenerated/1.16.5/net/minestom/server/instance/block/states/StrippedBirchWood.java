package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedBirchWood {
  public static final BlockState STRIPPED_BIRCH_WOOD_0 = new BlockState((short) 133, Block.STRIPPED_BIRCH_WOOD);

  public static final BlockState STRIPPED_BIRCH_WOOD_1 = new BlockState((short) 134, Block.STRIPPED_BIRCH_WOOD);

  public static final BlockState STRIPPED_BIRCH_WOOD_2 = new BlockState((short) 135, Block.STRIPPED_BIRCH_WOOD);

  public static void initStates() {
    Block.STRIPPED_BIRCH_WOOD.addBlockState(STRIPPED_BIRCH_WOOD_0);
    Block.STRIPPED_BIRCH_WOOD.addBlockState(STRIPPED_BIRCH_WOOD_1);
    Block.STRIPPED_BIRCH_WOOD.addBlockState(STRIPPED_BIRCH_WOOD_2);
  }
}
