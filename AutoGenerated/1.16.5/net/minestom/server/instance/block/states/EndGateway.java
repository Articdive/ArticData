package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EndGateway {
  public static final BlockState END_GATEWAY_0 = new BlockState((short) 9228, Block.END_GATEWAY);

  public static void initStates() {
    Block.END_GATEWAY.addBlockState(END_GATEWAY_0);
  }
}
