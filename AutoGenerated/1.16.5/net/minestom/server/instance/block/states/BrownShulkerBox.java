package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownShulkerBox {
  public static final BlockState BROWN_SHULKER_BOX_0 = new BlockState((short) 9354, Block.BROWN_SHULKER_BOX);

  public static final BlockState BROWN_SHULKER_BOX_1 = new BlockState((short) 9355, Block.BROWN_SHULKER_BOX);

  public static final BlockState BROWN_SHULKER_BOX_2 = new BlockState((short) 9356, Block.BROWN_SHULKER_BOX);

  public static final BlockState BROWN_SHULKER_BOX_3 = new BlockState((short) 9357, Block.BROWN_SHULKER_BOX);

  public static final BlockState BROWN_SHULKER_BOX_4 = new BlockState((short) 9358, Block.BROWN_SHULKER_BOX);

  public static final BlockState BROWN_SHULKER_BOX_5 = new BlockState((short) 9359, Block.BROWN_SHULKER_BOX);

  public static void initStates() {
    Block.BROWN_SHULKER_BOX.addBlockState(BROWN_SHULKER_BOX_0);
    Block.BROWN_SHULKER_BOX.addBlockState(BROWN_SHULKER_BOX_1);
    Block.BROWN_SHULKER_BOX.addBlockState(BROWN_SHULKER_BOX_2);
    Block.BROWN_SHULKER_BOX.addBlockState(BROWN_SHULKER_BOX_3);
    Block.BROWN_SHULKER_BOX.addBlockState(BROWN_SHULKER_BOX_4);
    Block.BROWN_SHULKER_BOX.addBlockState(BROWN_SHULKER_BOX_5);
  }
}
