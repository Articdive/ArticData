package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedGlazedTerracotta {
  public static final BlockState RED_GLAZED_TERRACOTTA_0 = new BlockState((short) 9434, Block.RED_GLAZED_TERRACOTTA);

  public static final BlockState RED_GLAZED_TERRACOTTA_1 = new BlockState((short) 9435, Block.RED_GLAZED_TERRACOTTA);

  public static final BlockState RED_GLAZED_TERRACOTTA_2 = new BlockState((short) 9436, Block.RED_GLAZED_TERRACOTTA);

  public static final BlockState RED_GLAZED_TERRACOTTA_3 = new BlockState((short) 9437, Block.RED_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.RED_GLAZED_TERRACOTTA.addBlockState(RED_GLAZED_TERRACOTTA_0);
    Block.RED_GLAZED_TERRACOTTA.addBlockState(RED_GLAZED_TERRACOTTA_1);
    Block.RED_GLAZED_TERRACOTTA.addBlockState(RED_GLAZED_TERRACOTTA_2);
    Block.RED_GLAZED_TERRACOTTA.addBlockState(RED_GLAZED_TERRACOTTA_3);
  }
}
