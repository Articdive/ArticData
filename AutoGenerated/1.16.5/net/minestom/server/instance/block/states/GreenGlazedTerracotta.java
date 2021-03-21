package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GreenGlazedTerracotta {
  public static final BlockState GREEN_GLAZED_TERRACOTTA_0 = new BlockState((short) 9430, Block.GREEN_GLAZED_TERRACOTTA);

  public static final BlockState GREEN_GLAZED_TERRACOTTA_1 = new BlockState((short) 9431, Block.GREEN_GLAZED_TERRACOTTA);

  public static final BlockState GREEN_GLAZED_TERRACOTTA_2 = new BlockState((short) 9432, Block.GREEN_GLAZED_TERRACOTTA);

  public static final BlockState GREEN_GLAZED_TERRACOTTA_3 = new BlockState((short) 9433, Block.GREEN_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.GREEN_GLAZED_TERRACOTTA.addBlockState(GREEN_GLAZED_TERRACOTTA_0);
    Block.GREEN_GLAZED_TERRACOTTA.addBlockState(GREEN_GLAZED_TERRACOTTA_1);
    Block.GREEN_GLAZED_TERRACOTTA.addBlockState(GREEN_GLAZED_TERRACOTTA_2);
    Block.GREEN_GLAZED_TERRACOTTA.addBlockState(GREEN_GLAZED_TERRACOTTA_3);
  }
}
