package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrayGlazedTerracotta {
  public static final BlockState GRAY_GLAZED_TERRACOTTA_0 = new BlockState((short) 9406, Block.GRAY_GLAZED_TERRACOTTA);

  public static final BlockState GRAY_GLAZED_TERRACOTTA_1 = new BlockState((short) 9407, Block.GRAY_GLAZED_TERRACOTTA);

  public static final BlockState GRAY_GLAZED_TERRACOTTA_2 = new BlockState((short) 9408, Block.GRAY_GLAZED_TERRACOTTA);

  public static final BlockState GRAY_GLAZED_TERRACOTTA_3 = new BlockState((short) 9409, Block.GRAY_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.GRAY_GLAZED_TERRACOTTA.addBlockState(GRAY_GLAZED_TERRACOTTA_0);
    Block.GRAY_GLAZED_TERRACOTTA.addBlockState(GRAY_GLAZED_TERRACOTTA_1);
    Block.GRAY_GLAZED_TERRACOTTA.addBlockState(GRAY_GLAZED_TERRACOTTA_2);
    Block.GRAY_GLAZED_TERRACOTTA.addBlockState(GRAY_GLAZED_TERRACOTTA_3);
  }
}
