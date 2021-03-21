package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlueGlazedTerracotta {
  public static final BlockState BLUE_GLAZED_TERRACOTTA_0 = new BlockState((short) 9422, Block.BLUE_GLAZED_TERRACOTTA);

  public static final BlockState BLUE_GLAZED_TERRACOTTA_1 = new BlockState((short) 9423, Block.BLUE_GLAZED_TERRACOTTA);

  public static final BlockState BLUE_GLAZED_TERRACOTTA_2 = new BlockState((short) 9424, Block.BLUE_GLAZED_TERRACOTTA);

  public static final BlockState BLUE_GLAZED_TERRACOTTA_3 = new BlockState((short) 9425, Block.BLUE_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.BLUE_GLAZED_TERRACOTTA.addBlockState(BLUE_GLAZED_TERRACOTTA_0);
    Block.BLUE_GLAZED_TERRACOTTA.addBlockState(BLUE_GLAZED_TERRACOTTA_1);
    Block.BLUE_GLAZED_TERRACOTTA.addBlockState(BLUE_GLAZED_TERRACOTTA_2);
    Block.BLUE_GLAZED_TERRACOTTA.addBlockState(BLUE_GLAZED_TERRACOTTA_3);
  }
}
