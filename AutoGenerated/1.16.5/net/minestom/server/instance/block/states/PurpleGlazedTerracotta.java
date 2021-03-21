package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpleGlazedTerracotta {
  public static final BlockState PURPLE_GLAZED_TERRACOTTA_0 = new BlockState((short) 9418, Block.PURPLE_GLAZED_TERRACOTTA);

  public static final BlockState PURPLE_GLAZED_TERRACOTTA_1 = new BlockState((short) 9419, Block.PURPLE_GLAZED_TERRACOTTA);

  public static final BlockState PURPLE_GLAZED_TERRACOTTA_2 = new BlockState((short) 9420, Block.PURPLE_GLAZED_TERRACOTTA);

  public static final BlockState PURPLE_GLAZED_TERRACOTTA_3 = new BlockState((short) 9421, Block.PURPLE_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.PURPLE_GLAZED_TERRACOTTA.addBlockState(PURPLE_GLAZED_TERRACOTTA_0);
    Block.PURPLE_GLAZED_TERRACOTTA.addBlockState(PURPLE_GLAZED_TERRACOTTA_1);
    Block.PURPLE_GLAZED_TERRACOTTA.addBlockState(PURPLE_GLAZED_TERRACOTTA_2);
    Block.PURPLE_GLAZED_TERRACOTTA.addBlockState(PURPLE_GLAZED_TERRACOTTA_3);
  }
}
