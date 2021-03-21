package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Sponge {
  public static final BlockState SPONGE_0 = new BlockState((short) 229, Block.SPONGE);

  public static void initStates() {
    Block.SPONGE.addBlockState(SPONGE_0);
  }
}
