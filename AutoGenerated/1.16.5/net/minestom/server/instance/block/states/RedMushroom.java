package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedMushroom {
  public static final BlockState RED_MUSHROOM_0 = new BlockState((short) 1426, Block.RED_MUSHROOM);

  public static void initStates() {
    Block.RED_MUSHROOM.addBlockState(RED_MUSHROOM_0);
  }
}
