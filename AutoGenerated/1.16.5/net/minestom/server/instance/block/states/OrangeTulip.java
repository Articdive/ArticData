package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OrangeTulip {
  public static final BlockState ORANGE_TULIP_0 = new BlockState((short) 1418, Block.ORANGE_TULIP);

  public static void initStates() {
    Block.ORANGE_TULIP.addBlockState(ORANGE_TULIP_0);
  }
}
