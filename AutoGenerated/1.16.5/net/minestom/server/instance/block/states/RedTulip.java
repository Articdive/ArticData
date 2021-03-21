package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedTulip {
  public static final BlockState RED_TULIP_0 = new BlockState((short) 1417, Block.RED_TULIP);

  public static void initStates() {
    Block.RED_TULIP.addBlockState(RED_TULIP_0);
  }
}
