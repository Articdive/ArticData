package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CyanShulkerBox {
  public static final BlockState CYAN_SHULKER_BOX_0 = new BlockState((short) 9336, Block.CYAN_SHULKER_BOX);

  public static final BlockState CYAN_SHULKER_BOX_1 = new BlockState((short) 9337, Block.CYAN_SHULKER_BOX);

  public static final BlockState CYAN_SHULKER_BOX_2 = new BlockState((short) 9338, Block.CYAN_SHULKER_BOX);

  public static final BlockState CYAN_SHULKER_BOX_3 = new BlockState((short) 9339, Block.CYAN_SHULKER_BOX);

  public static final BlockState CYAN_SHULKER_BOX_4 = new BlockState((short) 9340, Block.CYAN_SHULKER_BOX);

  public static final BlockState CYAN_SHULKER_BOX_5 = new BlockState((short) 9341, Block.CYAN_SHULKER_BOX);

  public static void initStates() {
    Block.CYAN_SHULKER_BOX.addBlockState(CYAN_SHULKER_BOX_0);
    Block.CYAN_SHULKER_BOX.addBlockState(CYAN_SHULKER_BOX_1);
    Block.CYAN_SHULKER_BOX.addBlockState(CYAN_SHULKER_BOX_2);
    Block.CYAN_SHULKER_BOX.addBlockState(CYAN_SHULKER_BOX_3);
    Block.CYAN_SHULKER_BOX.addBlockState(CYAN_SHULKER_BOX_4);
    Block.CYAN_SHULKER_BOX.addBlockState(CYAN_SHULKER_BOX_5);
  }
}
