package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightGrayShulkerBox {
  public static final BlockState LIGHT_GRAY_SHULKER_BOX_0 = new BlockState((short) 9330, Block.LIGHT_GRAY_SHULKER_BOX);

  public static final BlockState LIGHT_GRAY_SHULKER_BOX_1 = new BlockState((short) 9331, Block.LIGHT_GRAY_SHULKER_BOX);

  public static final BlockState LIGHT_GRAY_SHULKER_BOX_2 = new BlockState((short) 9332, Block.LIGHT_GRAY_SHULKER_BOX);

  public static final BlockState LIGHT_GRAY_SHULKER_BOX_3 = new BlockState((short) 9333, Block.LIGHT_GRAY_SHULKER_BOX);

  public static final BlockState LIGHT_GRAY_SHULKER_BOX_4 = new BlockState((short) 9334, Block.LIGHT_GRAY_SHULKER_BOX);

  public static final BlockState LIGHT_GRAY_SHULKER_BOX_5 = new BlockState((short) 9335, Block.LIGHT_GRAY_SHULKER_BOX);

  public static void initStates() {
    Block.LIGHT_GRAY_SHULKER_BOX.addBlockState(LIGHT_GRAY_SHULKER_BOX_0);
    Block.LIGHT_GRAY_SHULKER_BOX.addBlockState(LIGHT_GRAY_SHULKER_BOX_1);
    Block.LIGHT_GRAY_SHULKER_BOX.addBlockState(LIGHT_GRAY_SHULKER_BOX_2);
    Block.LIGHT_GRAY_SHULKER_BOX.addBlockState(LIGHT_GRAY_SHULKER_BOX_3);
    Block.LIGHT_GRAY_SHULKER_BOX.addBlockState(LIGHT_GRAY_SHULKER_BOX_4);
    Block.LIGHT_GRAY_SHULKER_BOX.addBlockState(LIGHT_GRAY_SHULKER_BOX_5);
  }
}
