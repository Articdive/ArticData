package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightBlueGlazedTerracotta {
  public static final BlockState LIGHT_BLUE_GLAZED_TERRACOTTA_0 = new BlockState((short) 9390, Block.LIGHT_BLUE_GLAZED_TERRACOTTA);

  public static final BlockState LIGHT_BLUE_GLAZED_TERRACOTTA_1 = new BlockState((short) 9391, Block.LIGHT_BLUE_GLAZED_TERRACOTTA);

  public static final BlockState LIGHT_BLUE_GLAZED_TERRACOTTA_2 = new BlockState((short) 9392, Block.LIGHT_BLUE_GLAZED_TERRACOTTA);

  public static final BlockState LIGHT_BLUE_GLAZED_TERRACOTTA_3 = new BlockState((short) 9393, Block.LIGHT_BLUE_GLAZED_TERRACOTTA);

  public static void initStates() {
    Block.LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockState(LIGHT_BLUE_GLAZED_TERRACOTTA_0);
    Block.LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockState(LIGHT_BLUE_GLAZED_TERRACOTTA_1);
    Block.LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockState(LIGHT_BLUE_GLAZED_TERRACOTTA_2);
    Block.LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockState(LIGHT_BLUE_GLAZED_TERRACOTTA_3);
  }
}
