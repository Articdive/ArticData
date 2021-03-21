package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class YellowGlazedTerracotta {
  public static final BlockState YELLOW_GLAZED_TERRACOTTA_0 = new BlockState((short) 9394, Block.YELLOW_GLAZED_TERRACOTTA);

  public static final BlockState YELLOW_GLAZED_TERRACOTTA_1 = new BlockState((short) 9395, Block.YELLOW_GLAZED_TERRACOTTA);

  public static final BlockState YELLOW_GLAZED_TERRACOTTA_2 = new BlockState((short) 9396, Block.YELLOW_GLAZED_TERRACOTTA);

  public static final BlockState YELLOW_GLAZED_TERRACOTTA_3 = new BlockState((short) 9397, Block.YELLOW_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.YELLOW_GLAZED_TERRACOTTA.addBlockState(YELLOW_GLAZED_TERRACOTTA_0);
    Block.YELLOW_GLAZED_TERRACOTTA.addBlockState(YELLOW_GLAZED_TERRACOTTA_1);
    Block.YELLOW_GLAZED_TERRACOTTA.addBlockState(YELLOW_GLAZED_TERRACOTTA_2);
    Block.YELLOW_GLAZED_TERRACOTTA.addBlockState(YELLOW_GLAZED_TERRACOTTA_3);
  }
}
