package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LimeShulkerBox {
  public static final BlockState LIME_SHULKER_BOX_0 = new BlockState((short) 9312, Block.LIME_SHULKER_BOX);

  public static final BlockState LIME_SHULKER_BOX_1 = new BlockState((short) 9313, Block.LIME_SHULKER_BOX);

  public static final BlockState LIME_SHULKER_BOX_2 = new BlockState((short) 9314, Block.LIME_SHULKER_BOX);

  public static final BlockState LIME_SHULKER_BOX_3 = new BlockState((short) 9315, Block.LIME_SHULKER_BOX);

  public static final BlockState LIME_SHULKER_BOX_4 = new BlockState((short) 9316, Block.LIME_SHULKER_BOX);

  public static final BlockState LIME_SHULKER_BOX_5 = new BlockState((short) 9317, Block.LIME_SHULKER_BOX);

  public static void initStates() {
    Block.LIME_SHULKER_BOX.addBlockState(LIME_SHULKER_BOX_0);
    Block.LIME_SHULKER_BOX.addBlockState(LIME_SHULKER_BOX_1);
    Block.LIME_SHULKER_BOX.addBlockState(LIME_SHULKER_BOX_2);
    Block.LIME_SHULKER_BOX.addBlockState(LIME_SHULKER_BOX_3);
    Block.LIME_SHULKER_BOX.addBlockState(LIME_SHULKER_BOX_4);
    Block.LIME_SHULKER_BOX.addBlockState(LIME_SHULKER_BOX_5);
  }
}
