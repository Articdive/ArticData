package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedBlueOrchid {
  public static final BlockState POTTED_BLUE_ORCHID_0 = new BlockState((short) 6319, Block.POTTED_BLUE_ORCHID);

  public static void initStates() {
    Block.POTTED_BLUE_ORCHID.addBlockState(POTTED_BLUE_ORCHID_0);
  }
}
