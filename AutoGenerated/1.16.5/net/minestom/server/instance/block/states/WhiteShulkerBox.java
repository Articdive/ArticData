package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WhiteShulkerBox {
  public static final BlockState WHITE_SHULKER_BOX_0 = new BlockState((short) 9282, Block.WHITE_SHULKER_BOX);

  public static final BlockState WHITE_SHULKER_BOX_1 = new BlockState((short) 9283, Block.WHITE_SHULKER_BOX);

  public static final BlockState WHITE_SHULKER_BOX_2 = new BlockState((short) 9284, Block.WHITE_SHULKER_BOX);

  public static final BlockState WHITE_SHULKER_BOX_3 = new BlockState((short) 9285, Block.WHITE_SHULKER_BOX);

  public static final BlockState WHITE_SHULKER_BOX_4 = new BlockState((short) 9286, Block.WHITE_SHULKER_BOX);

  public static final BlockState WHITE_SHULKER_BOX_5 = new BlockState((short) 9287, Block.WHITE_SHULKER_BOX);

  public static void initStates() {
    Block.WHITE_SHULKER_BOX.addBlockState(WHITE_SHULKER_BOX_0);
    Block.WHITE_SHULKER_BOX.addBlockState(WHITE_SHULKER_BOX_1);
    Block.WHITE_SHULKER_BOX.addBlockState(WHITE_SHULKER_BOX_2);
    Block.WHITE_SHULKER_BOX.addBlockState(WHITE_SHULKER_BOX_3);
    Block.WHITE_SHULKER_BOX.addBlockState(WHITE_SHULKER_BOX_4);
    Block.WHITE_SHULKER_BOX.addBlockState(WHITE_SHULKER_BOX_5);
  }
}
