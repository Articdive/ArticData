package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpleShulkerBox {
  public static final BlockState PURPLE_SHULKER_BOX_0 = new BlockState((short) 9342, Block.PURPLE_SHULKER_BOX);

  public static final BlockState PURPLE_SHULKER_BOX_1 = new BlockState((short) 9343, Block.PURPLE_SHULKER_BOX);

  public static final BlockState PURPLE_SHULKER_BOX_2 = new BlockState((short) 9344, Block.PURPLE_SHULKER_BOX);

  public static final BlockState PURPLE_SHULKER_BOX_3 = new BlockState((short) 9345, Block.PURPLE_SHULKER_BOX);

  public static final BlockState PURPLE_SHULKER_BOX_4 = new BlockState((short) 9346, Block.PURPLE_SHULKER_BOX);

  public static final BlockState PURPLE_SHULKER_BOX_5 = new BlockState((short) 9347, Block.PURPLE_SHULKER_BOX);

  public static void initStates() {
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_0);
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_1);
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_2);
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_3);
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_4);
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_5);
  }
}
