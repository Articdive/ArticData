package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MagentaGlazedTerracotta {
  public static final BlockState MAGENTA_GLAZED_TERRACOTTA_0 = new BlockState((short) 9386, Block.MAGENTA_GLAZED_TERRACOTTA);

  public static final BlockState MAGENTA_GLAZED_TERRACOTTA_1 = new BlockState((short) 9387, Block.MAGENTA_GLAZED_TERRACOTTA);

  public static final BlockState MAGENTA_GLAZED_TERRACOTTA_2 = new BlockState((short) 9388, Block.MAGENTA_GLAZED_TERRACOTTA);

  public static final BlockState MAGENTA_GLAZED_TERRACOTTA_3 = new BlockState((short) 9389, Block.MAGENTA_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.MAGENTA_GLAZED_TERRACOTTA.addBlockState(MAGENTA_GLAZED_TERRACOTTA_0);
    Block.MAGENTA_GLAZED_TERRACOTTA.addBlockState(MAGENTA_GLAZED_TERRACOTTA_1);
    Block.MAGENTA_GLAZED_TERRACOTTA.addBlockState(MAGENTA_GLAZED_TERRACOTTA_2);
    Block.MAGENTA_GLAZED_TERRACOTTA.addBlockState(MAGENTA_GLAZED_TERRACOTTA_3);
  }
}
