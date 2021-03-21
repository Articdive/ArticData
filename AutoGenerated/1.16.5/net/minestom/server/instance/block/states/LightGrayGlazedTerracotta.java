package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightGrayGlazedTerracotta {
  public static final BlockState LIGHT_GRAY_GLAZED_TERRACOTTA_0 = new BlockState((short) 9410, Block.LIGHT_GRAY_GLAZED_TERRACOTTA);

  public static final BlockState LIGHT_GRAY_GLAZED_TERRACOTTA_1 = new BlockState((short) 9411, Block.LIGHT_GRAY_GLAZED_TERRACOTTA);

  public static final BlockState LIGHT_GRAY_GLAZED_TERRACOTTA_2 = new BlockState((short) 9412, Block.LIGHT_GRAY_GLAZED_TERRACOTTA);

  public static final BlockState LIGHT_GRAY_GLAZED_TERRACOTTA_3 = new BlockState((short) 9413, Block.LIGHT_GRAY_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.LIGHT_GRAY_GLAZED_TERRACOTTA.addBlockState(LIGHT_GRAY_GLAZED_TERRACOTTA_0);
    Block.LIGHT_GRAY_GLAZED_TERRACOTTA.addBlockState(LIGHT_GRAY_GLAZED_TERRACOTTA_1);
    Block.LIGHT_GRAY_GLAZED_TERRACOTTA.addBlockState(LIGHT_GRAY_GLAZED_TERRACOTTA_2);
    Block.LIGHT_GRAY_GLAZED_TERRACOTTA.addBlockState(LIGHT_GRAY_GLAZED_TERRACOTTA_3);
  }
}
