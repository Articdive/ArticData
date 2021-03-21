package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedRedMushroom {
  public static final BlockState POTTED_RED_MUSHROOM_0 = new BlockState((short) 6330, Block.POTTED_RED_MUSHROOM);

  public static void initStates() {
    Block.POTTED_RED_MUSHROOM.addBlockState(POTTED_RED_MUSHROOM_0);
  }
}
