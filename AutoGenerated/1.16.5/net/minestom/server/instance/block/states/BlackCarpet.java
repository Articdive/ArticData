package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlackCarpet {
  public static final BlockState BLACK_CARPET_0 = new BlockState((short) 7885, Block.BLACK_CARPET);

  public static void initStates() {
    Block.BLACK_CARPET.addBlockState(BLACK_CARPET_0);
  }
}
