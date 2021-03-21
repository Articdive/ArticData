package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OrangeShulkerBox {
  public static final BlockState ORANGE_SHULKER_BOX_0 = new BlockState((short) 9288, Block.ORANGE_SHULKER_BOX);

  public static final BlockState ORANGE_SHULKER_BOX_1 = new BlockState((short) 9289, Block.ORANGE_SHULKER_BOX);

  public static final BlockState ORANGE_SHULKER_BOX_2 = new BlockState((short) 9290, Block.ORANGE_SHULKER_BOX);

  public static final BlockState ORANGE_SHULKER_BOX_3 = new BlockState((short) 9291, Block.ORANGE_SHULKER_BOX);

  public static final BlockState ORANGE_SHULKER_BOX_4 = new BlockState((short) 9292, Block.ORANGE_SHULKER_BOX);

  public static final BlockState ORANGE_SHULKER_BOX_5 = new BlockState((short) 9293, Block.ORANGE_SHULKER_BOX);

  public static void initStates() {
    Block.ORANGE_SHULKER_BOX.addBlockState(ORANGE_SHULKER_BOX_0);
    Block.ORANGE_SHULKER_BOX.addBlockState(ORANGE_SHULKER_BOX_1);
    Block.ORANGE_SHULKER_BOX.addBlockState(ORANGE_SHULKER_BOX_2);
    Block.ORANGE_SHULKER_BOX.addBlockState(ORANGE_SHULKER_BOX_3);
    Block.ORANGE_SHULKER_BOX.addBlockState(ORANGE_SHULKER_BOX_4);
    Block.ORANGE_SHULKER_BOX.addBlockState(ORANGE_SHULKER_BOX_5);
  }
}
