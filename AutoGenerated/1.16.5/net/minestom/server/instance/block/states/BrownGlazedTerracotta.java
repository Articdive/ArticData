package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownGlazedTerracotta {
  public static final BlockState BROWN_GLAZED_TERRACOTTA_0 = new BlockState((short) 9426, Block.BROWN_GLAZED_TERRACOTTA);

  public static final BlockState BROWN_GLAZED_TERRACOTTA_1 = new BlockState((short) 9427, Block.BROWN_GLAZED_TERRACOTTA);

  public static final BlockState BROWN_GLAZED_TERRACOTTA_2 = new BlockState((short) 9428, Block.BROWN_GLAZED_TERRACOTTA);

  public static final BlockState BROWN_GLAZED_TERRACOTTA_3 = new BlockState((short) 9429, Block.BROWN_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.BROWN_GLAZED_TERRACOTTA.addBlockState(BROWN_GLAZED_TERRACOTTA_0);
    Block.BROWN_GLAZED_TERRACOTTA.addBlockState(BROWN_GLAZED_TERRACOTTA_1);
    Block.BROWN_GLAZED_TERRACOTTA.addBlockState(BROWN_GLAZED_TERRACOTTA_2);
    Block.BROWN_GLAZED_TERRACOTTA.addBlockState(BROWN_GLAZED_TERRACOTTA_3);
  }
}
