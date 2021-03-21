package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MagentaShulkerBox {
  public static final BlockState MAGENTA_SHULKER_BOX_0 = new BlockState((short) 9294, Block.MAGENTA_SHULKER_BOX);

  public static final BlockState MAGENTA_SHULKER_BOX_1 = new BlockState((short) 9295, Block.MAGENTA_SHULKER_BOX);

  public static final BlockState MAGENTA_SHULKER_BOX_2 = new BlockState((short) 9296, Block.MAGENTA_SHULKER_BOX);

  public static final BlockState MAGENTA_SHULKER_BOX_3 = new BlockState((short) 9297, Block.MAGENTA_SHULKER_BOX);

  public static final BlockState MAGENTA_SHULKER_BOX_4 = new BlockState((short) 9298, Block.MAGENTA_SHULKER_BOX);

  public static final BlockState MAGENTA_SHULKER_BOX_5 = new BlockState((short) 9299, Block.MAGENTA_SHULKER_BOX);

  public static void initStates() {
    Block.MAGENTA_SHULKER_BOX.addBlockState(MAGENTA_SHULKER_BOX_0);
    Block.MAGENTA_SHULKER_BOX.addBlockState(MAGENTA_SHULKER_BOX_1);
    Block.MAGENTA_SHULKER_BOX.addBlockState(MAGENTA_SHULKER_BOX_2);
    Block.MAGENTA_SHULKER_BOX.addBlockState(MAGENTA_SHULKER_BOX_3);
    Block.MAGENTA_SHULKER_BOX.addBlockState(MAGENTA_SHULKER_BOX_4);
    Block.MAGENTA_SHULKER_BOX.addBlockState(MAGENTA_SHULKER_BOX_5);
  }
}
