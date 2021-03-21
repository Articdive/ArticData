package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OrangeGlazedTerracotta {
  public static final BlockState ORANGE_GLAZED_TERRACOTTA_0 = new BlockState((short) 9382, Block.ORANGE_GLAZED_TERRACOTTA);

  public static final BlockState ORANGE_GLAZED_TERRACOTTA_1 = new BlockState((short) 9383, Block.ORANGE_GLAZED_TERRACOTTA);

  public static final BlockState ORANGE_GLAZED_TERRACOTTA_2 = new BlockState((short) 9384, Block.ORANGE_GLAZED_TERRACOTTA);

  public static final BlockState ORANGE_GLAZED_TERRACOTTA_3 = new BlockState((short) 9385, Block.ORANGE_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.ORANGE_GLAZED_TERRACOTTA.addBlockState(ORANGE_GLAZED_TERRACOTTA_0);
    Block.ORANGE_GLAZED_TERRACOTTA.addBlockState(ORANGE_GLAZED_TERRACOTTA_1);
    Block.ORANGE_GLAZED_TERRACOTTA.addBlockState(ORANGE_GLAZED_TERRACOTTA_2);
    Block.ORANGE_GLAZED_TERRACOTTA.addBlockState(ORANGE_GLAZED_TERRACOTTA_3);
  }
}
