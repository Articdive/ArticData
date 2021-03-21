package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlackGlazedTerracotta {
  public static final BlockState BLACK_GLAZED_TERRACOTTA_0 = new BlockState((short) 9438, Block.BLACK_GLAZED_TERRACOTTA);

  public static final BlockState BLACK_GLAZED_TERRACOTTA_1 = new BlockState((short) 9439, Block.BLACK_GLAZED_TERRACOTTA);

  public static final BlockState BLACK_GLAZED_TERRACOTTA_2 = new BlockState((short) 9440, Block.BLACK_GLAZED_TERRACOTTA);

  public static final BlockState BLACK_GLAZED_TERRACOTTA_3 = new BlockState((short) 9441, Block.BLACK_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.BLACK_GLAZED_TERRACOTTA.addBlockState(BLACK_GLAZED_TERRACOTTA_0);
    Block.BLACK_GLAZED_TERRACOTTA.addBlockState(BLACK_GLAZED_TERRACOTTA_1);
    Block.BLACK_GLAZED_TERRACOTTA.addBlockState(BLACK_GLAZED_TERRACOTTA_2);
    Block.BLACK_GLAZED_TERRACOTTA.addBlockState(BLACK_GLAZED_TERRACOTTA_3);
  }
}
