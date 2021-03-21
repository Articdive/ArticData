package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedWhiteTulip {
  public static final BlockState POTTED_WHITE_TULIP_0 = new BlockState((short) 6324, Block.POTTED_WHITE_TULIP);

  public static void initStates() {
    Block.POTTED_WHITE_TULIP.addBlockState(POTTED_WHITE_TULIP_0);
  }
}
