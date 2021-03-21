package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BirchWood {
  public static final BlockState BIRCH_WOOD_0 = new BlockState((short) 115, Block.BIRCH_WOOD);

  public static final BlockState BIRCH_WOOD_1 = new BlockState((short) 116, Block.BIRCH_WOOD);

  public static final BlockState BIRCH_WOOD_2 = new BlockState((short) 117, Block.BIRCH_WOOD);

  public static void initStates() {
    Block.BIRCH_WOOD.addBlockState(BIRCH_WOOD_0);
    Block.BIRCH_WOOD.addBlockState(BIRCH_WOOD_1);
    Block.BIRCH_WOOD.addBlockState(BIRCH_WOOD_2);
  }
}
