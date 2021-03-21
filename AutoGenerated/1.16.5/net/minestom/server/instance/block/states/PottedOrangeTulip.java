package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedOrangeTulip {
  public static final BlockState POTTED_ORANGE_TULIP_0 = new BlockState((short) 6323, Block.POTTED_ORANGE_TULIP);

  public static void initStates() {
    Block.POTTED_ORANGE_TULIP.addBlockState(POTTED_ORANGE_TULIP_0);
  }
}
