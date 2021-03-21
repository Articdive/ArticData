package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class YellowShulkerBox {
  public static final BlockState YELLOW_SHULKER_BOX_0 = new BlockState((short) 9306, Block.YELLOW_SHULKER_BOX);

  public static final BlockState YELLOW_SHULKER_BOX_1 = new BlockState((short) 9307, Block.YELLOW_SHULKER_BOX);

  public static final BlockState YELLOW_SHULKER_BOX_2 = new BlockState((short) 9308, Block.YELLOW_SHULKER_BOX);

  public static final BlockState YELLOW_SHULKER_BOX_3 = new BlockState((short) 9309, Block.YELLOW_SHULKER_BOX);

  public static final BlockState YELLOW_SHULKER_BOX_4 = new BlockState((short) 9310, Block.YELLOW_SHULKER_BOX);

  public static final BlockState YELLOW_SHULKER_BOX_5 = new BlockState((short) 9311, Block.YELLOW_SHULKER_BOX);

  public static void initStates() {
    Block.YELLOW_SHULKER_BOX.addBlockState(YELLOW_SHULKER_BOX_0);
    Block.YELLOW_SHULKER_BOX.addBlockState(YELLOW_SHULKER_BOX_1);
    Block.YELLOW_SHULKER_BOX.addBlockState(YELLOW_SHULKER_BOX_2);
    Block.YELLOW_SHULKER_BOX.addBlockState(YELLOW_SHULKER_BOX_3);
    Block.YELLOW_SHULKER_BOX.addBlockState(YELLOW_SHULKER_BOX_4);
    Block.YELLOW_SHULKER_BOX.addBlockState(YELLOW_SHULKER_BOX_5);
  }
}
