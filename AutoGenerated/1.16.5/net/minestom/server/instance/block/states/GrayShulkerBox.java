package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GrayShulkerBox {
  public static final BlockState GRAY_SHULKER_BOX_0 = new BlockState((short) 9324, Block.GRAY_SHULKER_BOX);

  public static final BlockState GRAY_SHULKER_BOX_1 = new BlockState((short) 9325, Block.GRAY_SHULKER_BOX);

  public static final BlockState GRAY_SHULKER_BOX_2 = new BlockState((short) 9326, Block.GRAY_SHULKER_BOX);

  public static final BlockState GRAY_SHULKER_BOX_3 = new BlockState((short) 9327, Block.GRAY_SHULKER_BOX);

  public static final BlockState GRAY_SHULKER_BOX_4 = new BlockState((short) 9328, Block.GRAY_SHULKER_BOX);

  public static final BlockState GRAY_SHULKER_BOX_5 = new BlockState((short) 9329, Block.GRAY_SHULKER_BOX);

  public static void initStates() {
    Block.GRAY_SHULKER_BOX.addBlockState(GRAY_SHULKER_BOX_0);
    Block.GRAY_SHULKER_BOX.addBlockState(GRAY_SHULKER_BOX_1);
    Block.GRAY_SHULKER_BOX.addBlockState(GRAY_SHULKER_BOX_2);
    Block.GRAY_SHULKER_BOX.addBlockState(GRAY_SHULKER_BOX_3);
    Block.GRAY_SHULKER_BOX.addBlockState(GRAY_SHULKER_BOX_4);
    Block.GRAY_SHULKER_BOX.addBlockState(GRAY_SHULKER_BOX_5);
  }
}
