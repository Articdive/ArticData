package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Cobweb {
  public static final BlockState COBWEB_0 = new BlockState((short) 1341, Block.COBWEB);

  public static void initStates() {
    Block.COBWEB.addBlockState(COBWEB_0);
  }
}
