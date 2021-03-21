package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedstoneLamp {
  public static final BlockState REDSTONE_LAMP_0 = new BlockState((short) 5160, Block.REDSTONE_LAMP);

  public static final BlockState REDSTONE_LAMP_1 = new BlockState((short) 5161, Block.REDSTONE_LAMP);

  public static void initStates() {
    Block.REDSTONE_LAMP.addBlockState(REDSTONE_LAMP_0);
    Block.REDSTONE_LAMP.addBlockState(REDSTONE_LAMP_1);
  }
}
