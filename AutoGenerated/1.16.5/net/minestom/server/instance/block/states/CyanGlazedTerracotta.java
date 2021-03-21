package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CyanGlazedTerracotta {
  public static final BlockState CYAN_GLAZED_TERRACOTTA_0 = new BlockState((short) 9414, Block.CYAN_GLAZED_TERRACOTTA);

  public static final BlockState CYAN_GLAZED_TERRACOTTA_1 = new BlockState((short) 9415, Block.CYAN_GLAZED_TERRACOTTA);

  public static final BlockState CYAN_GLAZED_TERRACOTTA_2 = new BlockState((short) 9416, Block.CYAN_GLAZED_TERRACOTTA);

  public static final BlockState CYAN_GLAZED_TERRACOTTA_3 = new BlockState((short) 9417, Block.CYAN_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.CYAN_GLAZED_TERRACOTTA.addBlockState(CYAN_GLAZED_TERRACOTTA_0);
    Block.CYAN_GLAZED_TERRACOTTA.addBlockState(CYAN_GLAZED_TERRACOTTA_1);
    Block.CYAN_GLAZED_TERRACOTTA.addBlockState(CYAN_GLAZED_TERRACOTTA_2);
    Block.CYAN_GLAZED_TERRACOTTA.addBlockState(CYAN_GLAZED_TERRACOTTA_3);
  }
}
