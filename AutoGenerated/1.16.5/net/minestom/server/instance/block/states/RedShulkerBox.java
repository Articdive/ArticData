package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedShulkerBox {
  public static final BlockState RED_SHULKER_BOX_0 = new BlockState((short) 9366, Block.RED_SHULKER_BOX);

  public static final BlockState RED_SHULKER_BOX_1 = new BlockState((short) 9367, Block.RED_SHULKER_BOX);

  public static final BlockState RED_SHULKER_BOX_2 = new BlockState((short) 9368, Block.RED_SHULKER_BOX);

  public static final BlockState RED_SHULKER_BOX_3 = new BlockState((short) 9369, Block.RED_SHULKER_BOX);

  public static final BlockState RED_SHULKER_BOX_4 = new BlockState((short) 9370, Block.RED_SHULKER_BOX);

  public static final BlockState RED_SHULKER_BOX_5 = new BlockState((short) 9371, Block.RED_SHULKER_BOX);

  public static void initStates() {
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_0);
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_1);
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_2);
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_3);
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_4);
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_5);
  }
}
