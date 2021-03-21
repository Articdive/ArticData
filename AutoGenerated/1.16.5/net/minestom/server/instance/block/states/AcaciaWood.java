package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AcaciaWood {
  public static final BlockState ACACIA_WOOD_0 = new BlockState((short) 121, Block.ACACIA_WOOD);

  public static final BlockState ACACIA_WOOD_1 = new BlockState((short) 122, Block.ACACIA_WOOD);

  public static final BlockState ACACIA_WOOD_2 = new BlockState((short) 123, Block.ACACIA_WOOD);

  public static void initStates() {
    Block.ACACIA_WOOD.addBlockState(ACACIA_WOOD_0);
    Block.ACACIA_WOOD.addBlockState(ACACIA_WOOD_1);
    Block.ACACIA_WOOD.addBlockState(ACACIA_WOOD_2);
  }
}
