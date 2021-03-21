package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LimeGlazedTerracotta {
  public static final BlockState LIME_GLAZED_TERRACOTTA_0 = new BlockState((short) 9398, Block.LIME_GLAZED_TERRACOTTA);

  public static final BlockState LIME_GLAZED_TERRACOTTA_1 = new BlockState((short) 9399, Block.LIME_GLAZED_TERRACOTTA);

  public static final BlockState LIME_GLAZED_TERRACOTTA_2 = new BlockState((short) 9400, Block.LIME_GLAZED_TERRACOTTA);

  public static final BlockState LIME_GLAZED_TERRACOTTA_3 = new BlockState((short) 9401, Block.LIME_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.LIME_GLAZED_TERRACOTTA.addBlockState(LIME_GLAZED_TERRACOTTA_0);
    Block.LIME_GLAZED_TERRACOTTA.addBlockState(LIME_GLAZED_TERRACOTTA_1);
    Block.LIME_GLAZED_TERRACOTTA.addBlockState(LIME_GLAZED_TERRACOTTA_2);
    Block.LIME_GLAZED_TERRACOTTA.addBlockState(LIME_GLAZED_TERRACOTTA_3);
  }
}
