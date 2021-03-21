package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WhiteGlazedTerracotta {
  public static final BlockState WHITE_GLAZED_TERRACOTTA_0 = new BlockState((short) 9378, Block.WHITE_GLAZED_TERRACOTTA);

  public static final BlockState WHITE_GLAZED_TERRACOTTA_1 = new BlockState((short) 9379, Block.WHITE_GLAZED_TERRACOTTA);

  public static final BlockState WHITE_GLAZED_TERRACOTTA_2 = new BlockState((short) 9380, Block.WHITE_GLAZED_TERRACOTTA);

  public static final BlockState WHITE_GLAZED_TERRACOTTA_3 = new BlockState((short) 9381, Block.WHITE_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.WHITE_GLAZED_TERRACOTTA.addBlockState(WHITE_GLAZED_TERRACOTTA_0);
    Block.WHITE_GLAZED_TERRACOTTA.addBlockState(WHITE_GLAZED_TERRACOTTA_1);
    Block.WHITE_GLAZED_TERRACOTTA.addBlockState(WHITE_GLAZED_TERRACOTTA_2);
    Block.WHITE_GLAZED_TERRACOTTA.addBlockState(WHITE_GLAZED_TERRACOTTA_3);
  }
}
