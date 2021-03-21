package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Lodestone {
  public static final BlockState LODESTONE_0 = new BlockState((short) 15846, Block.LODESTONE);

  public static void initStates() {
    Block.LODESTONE.addBlockState(LODESTONE_0);
  }
}
