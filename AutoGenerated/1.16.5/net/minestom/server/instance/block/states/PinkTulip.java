package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PinkTulip {
  public static final BlockState PINK_TULIP_0 = new BlockState((short) 1420, Block.PINK_TULIP);

  public static void initStates() {
    Block.PINK_TULIP.addBlockState(PINK_TULIP_0);
  }
}
