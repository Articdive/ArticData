package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GreenShulkerBox {
  public static final BlockState GREEN_SHULKER_BOX_0 = new BlockState((short) 9360, Block.GREEN_SHULKER_BOX);

  public static final BlockState GREEN_SHULKER_BOX_1 = new BlockState((short) 9361, Block.GREEN_SHULKER_BOX);

  public static final BlockState GREEN_SHULKER_BOX_2 = new BlockState((short) 9362, Block.GREEN_SHULKER_BOX);

  public static final BlockState GREEN_SHULKER_BOX_3 = new BlockState((short) 9363, Block.GREEN_SHULKER_BOX);

  public static final BlockState GREEN_SHULKER_BOX_4 = new BlockState((short) 9364, Block.GREEN_SHULKER_BOX);

  public static final BlockState GREEN_SHULKER_BOX_5 = new BlockState((short) 9365, Block.GREEN_SHULKER_BOX);

  public static void initStates() {
    Block.GREEN_SHULKER_BOX.addBlockState(GREEN_SHULKER_BOX_0);
    Block.GREEN_SHULKER_BOX.addBlockState(GREEN_SHULKER_BOX_1);
    Block.GREEN_SHULKER_BOX.addBlockState(GREEN_SHULKER_BOX_2);
    Block.GREEN_SHULKER_BOX.addBlockState(GREEN_SHULKER_BOX_3);
    Block.GREEN_SHULKER_BOX.addBlockState(GREEN_SHULKER_BOX_4);
    Block.GREEN_SHULKER_BOX.addBlockState(GREEN_SHULKER_BOX_5);
  }
}
