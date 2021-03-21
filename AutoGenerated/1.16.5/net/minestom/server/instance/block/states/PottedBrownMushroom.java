package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedBrownMushroom {
  public static final BlockState POTTED_BROWN_MUSHROOM_0 = new BlockState((short) 6331, Block.POTTED_BROWN_MUSHROOM);

  public static void initStates() {
    Block.POTTED_BROWN_MUSHROOM.addBlockState(POTTED_BROWN_MUSHROOM_0);
  }
}
