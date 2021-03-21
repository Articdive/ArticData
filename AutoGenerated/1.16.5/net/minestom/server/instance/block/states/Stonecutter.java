package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Stonecutter {
  public static final BlockState STONECUTTER_0 = new BlockState((short) 14854, Block.STONECUTTER);

  public static final BlockState STONECUTTER_1 = new BlockState((short) 14855, Block.STONECUTTER);

  public static final BlockState STONECUTTER_2 = new BlockState((short) 14856, Block.STONECUTTER);

  public static final BlockState STONECUTTER_3 = new BlockState((short) 14857, Block.STONECUTTER);

  public static void initStates() {
    Block.STONECUTTER.addBlockState(STONECUTTER_0);
    Block.STONECUTTER.addBlockState(STONECUTTER_1);
    Block.STONECUTTER.addBlockState(STONECUTTER_2);
    Block.STONECUTTER.addBlockState(STONECUTTER_3);
  }
}
