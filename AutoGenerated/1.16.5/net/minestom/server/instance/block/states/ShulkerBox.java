package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class ShulkerBox {
  public static final BlockState SHULKER_BOX_0 = new BlockState((short) 9276, Block.SHULKER_BOX);

  public static final BlockState SHULKER_BOX_1 = new BlockState((short) 9277, Block.SHULKER_BOX);

  public static final BlockState SHULKER_BOX_2 = new BlockState((short) 9278, Block.SHULKER_BOX);

  public static final BlockState SHULKER_BOX_3 = new BlockState((short) 9279, Block.SHULKER_BOX);

  public static final BlockState SHULKER_BOX_4 = new BlockState((short) 9280, Block.SHULKER_BOX);

  public static final BlockState SHULKER_BOX_5 = new BlockState((short) 9281, Block.SHULKER_BOX);

  public static void initStates() {
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_0);
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_1);
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_2);
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_3);
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_4);
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_5);
  }
}
