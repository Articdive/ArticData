package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LightBlueShulkerBox {
  public static final BlockState LIGHT_BLUE_SHULKER_BOX_0 = new BlockState((short) 9300, Block.LIGHT_BLUE_SHULKER_BOX);

  public static final BlockState LIGHT_BLUE_SHULKER_BOX_1 = new BlockState((short) 9301, Block.LIGHT_BLUE_SHULKER_BOX);

  public static final BlockState LIGHT_BLUE_SHULKER_BOX_2 = new BlockState((short) 9302, Block.LIGHT_BLUE_SHULKER_BOX);

  public static final BlockState LIGHT_BLUE_SHULKER_BOX_3 = new BlockState((short) 9303, Block.LIGHT_BLUE_SHULKER_BOX);

  public static final BlockState LIGHT_BLUE_SHULKER_BOX_4 = new BlockState((short) 9304, Block.LIGHT_BLUE_SHULKER_BOX);

  public static final BlockState LIGHT_BLUE_SHULKER_BOX_5 = new BlockState((short) 9305, Block.LIGHT_BLUE_SHULKER_BOX);

  public static void initStates() {
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_0);
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_1);
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_2);
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_3);
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_4);
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_5);
  }
}
