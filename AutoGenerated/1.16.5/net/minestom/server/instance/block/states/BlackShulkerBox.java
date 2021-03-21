package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlackShulkerBox {
  public static final BlockState BLACK_SHULKER_BOX_0 = new BlockState((short) 9372, Block.BLACK_SHULKER_BOX);

  public static final BlockState BLACK_SHULKER_BOX_1 = new BlockState((short) 9373, Block.BLACK_SHULKER_BOX);

  public static final BlockState BLACK_SHULKER_BOX_2 = new BlockState((short) 9374, Block.BLACK_SHULKER_BOX);

  public static final BlockState BLACK_SHULKER_BOX_3 = new BlockState((short) 9375, Block.BLACK_SHULKER_BOX);

  public static final BlockState BLACK_SHULKER_BOX_4 = new BlockState((short) 9376, Block.BLACK_SHULKER_BOX);

  public static final BlockState BLACK_SHULKER_BOX_5 = new BlockState((short) 9377, Block.BLACK_SHULKER_BOX);

  public static void initStates() {
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_0);
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_1);
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_2);
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_3);
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_4);
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_5);
  }
}
