package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedCarpet {
  public static final BlockState RED_CARPET_0 = new BlockState((short) 7884, Block.RED_CARPET);

  public static void initStates() {
    Block.RED_CARPET.addBlockState(RED_CARPET_0);
  }
}
