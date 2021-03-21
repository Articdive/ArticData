package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PinkGlazedTerracotta {
  public static final BlockState PINK_GLAZED_TERRACOTTA_0 = new BlockState((short) 9402, Block.PINK_GLAZED_TERRACOTTA);

  public static final BlockState PINK_GLAZED_TERRACOTTA_1 = new BlockState((short) 9403, Block.PINK_GLAZED_TERRACOTTA);

  public static final BlockState PINK_GLAZED_TERRACOTTA_2 = new BlockState((short) 9404, Block.PINK_GLAZED_TERRACOTTA);

  public static final BlockState PINK_GLAZED_TERRACOTTA_3 = new BlockState((short) 9405, Block.PINK_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.PINK_GLAZED_TERRACOTTA.addBlockState(PINK_GLAZED_TERRACOTTA_0);
    Block.PINK_GLAZED_TERRACOTTA.addBlockState(PINK_GLAZED_TERRACOTTA_1);
    Block.PINK_GLAZED_TERRACOTTA.addBlockState(PINK_GLAZED_TERRACOTTA_2);
    Block.PINK_GLAZED_TERRACOTTA.addBlockState(PINK_GLAZED_TERRACOTTA_3);
  }
}
