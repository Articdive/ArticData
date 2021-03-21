package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WhiteTulip {
  public static final BlockState WHITE_TULIP_0 = new BlockState((short) 1419, Block.WHITE_TULIP);

  public static void initStates() {
    Block.WHITE_TULIP.addBlockState(WHITE_TULIP_0);
  }
}
