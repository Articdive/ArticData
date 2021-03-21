package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedAcaciaWood {
  public static final BlockState STRIPPED_ACACIA_WOOD_0 = new BlockState((short) 139, Block.STRIPPED_ACACIA_WOOD);

  public static final BlockState STRIPPED_ACACIA_WOOD_1 = new BlockState((short) 140, Block.STRIPPED_ACACIA_WOOD);

  public static final BlockState STRIPPED_ACACIA_WOOD_2 = new BlockState((short) 141, Block.STRIPPED_ACACIA_WOOD);

  public static void initStates() {
    Block.STRIPPED_ACACIA_WOOD.addBlockState(STRIPPED_ACACIA_WOOD_0);
    Block.STRIPPED_ACACIA_WOOD.addBlockState(STRIPPED_ACACIA_WOOD_1);
    Block.STRIPPED_ACACIA_WOOD.addBlockState(STRIPPED_ACACIA_WOOD_2);
  }
}
