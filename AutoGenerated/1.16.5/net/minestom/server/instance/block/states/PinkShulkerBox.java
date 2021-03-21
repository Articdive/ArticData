package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PinkShulkerBox {
  public static final BlockState PINK_SHULKER_BOX_0 = new BlockState((short) 9318, Block.PINK_SHULKER_BOX);

  public static final BlockState PINK_SHULKER_BOX_1 = new BlockState((short) 9319, Block.PINK_SHULKER_BOX);

  public static final BlockState PINK_SHULKER_BOX_2 = new BlockState((short) 9320, Block.PINK_SHULKER_BOX);

  public static final BlockState PINK_SHULKER_BOX_3 = new BlockState((short) 9321, Block.PINK_SHULKER_BOX);

  public static final BlockState PINK_SHULKER_BOX_4 = new BlockState((short) 9322, Block.PINK_SHULKER_BOX);

  public static final BlockState PINK_SHULKER_BOX_5 = new BlockState((short) 9323, Block.PINK_SHULKER_BOX);

  public static void initStates() {
    Block.PINK_SHULKER_BOX.addBlockState(PINK_SHULKER_BOX_0);
    Block.PINK_SHULKER_BOX.addBlockState(PINK_SHULKER_BOX_1);
    Block.PINK_SHULKER_BOX.addBlockState(PINK_SHULKER_BOX_2);
    Block.PINK_SHULKER_BOX.addBlockState(PINK_SHULKER_BOX_3);
    Block.PINK_SHULKER_BOX.addBlockState(PINK_SHULKER_BOX_4);
    Block.PINK_SHULKER_BOX.addBlockState(PINK_SHULKER_BOX_5);
  }
}
