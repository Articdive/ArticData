package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrownMushroom {
  public static final BlockState BROWN_MUSHROOM_0 = new BlockState((short) 1425, Block.BROWN_MUSHROOM);

  public static void initStates() {
    Block.BROWN_MUSHROOM.addBlockState(BROWN_MUSHROOM_0);
  }
}
