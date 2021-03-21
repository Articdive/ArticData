package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Mycelium {
  public static final BlockState MYCELIUM_0 = new BlockState((short) 5016, Block.MYCELIUM);

  public static final BlockState MYCELIUM_1 = new BlockState((short) 5017, Block.MYCELIUM);

  public static void initStates() {
    Block.MYCELIUM.addBlockState(MYCELIUM_0);
    Block.MYCELIUM.addBlockState(MYCELIUM_1);
  }
}
