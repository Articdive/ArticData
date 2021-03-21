package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlueShulkerBox {
  public static final BlockState BLUE_SHULKER_BOX_0 = new BlockState((short) 9348, Block.BLUE_SHULKER_BOX);

  public static final BlockState BLUE_SHULKER_BOX_1 = new BlockState((short) 9349, Block.BLUE_SHULKER_BOX);

  public static final BlockState BLUE_SHULKER_BOX_2 = new BlockState((short) 9350, Block.BLUE_SHULKER_BOX);

  public static final BlockState BLUE_SHULKER_BOX_3 = new BlockState((short) 9351, Block.BLUE_SHULKER_BOX);

  public static final BlockState BLUE_SHULKER_BOX_4 = new BlockState((short) 9352, Block.BLUE_SHULKER_BOX);

  public static final BlockState BLUE_SHULKER_BOX_5 = new BlockState((short) 9353, Block.BLUE_SHULKER_BOX);

  public static void initStates() {
    Block.BLUE_SHULKER_BOX.addBlockState(BLUE_SHULKER_BOX_0);
    Block.BLUE_SHULKER_BOX.addBlockState(BLUE_SHULKER_BOX_1);
    Block.BLUE_SHULKER_BOX.addBlockState(BLUE_SHULKER_BOX_2);
    Block.BLUE_SHULKER_BOX.addBlockState(BLUE_SHULKER_BOX_3);
    Block.BLUE_SHULKER_BOX.addBlockState(BLUE_SHULKER_BOX_4);
    Block.BLUE_SHULKER_BOX.addBlockState(BLUE_SHULKER_BOX_5);
  }
}
