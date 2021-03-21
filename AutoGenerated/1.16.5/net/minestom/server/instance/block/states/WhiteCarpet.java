package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WhiteCarpet {
  public static final BlockState WHITE_CARPET_0 = new BlockState((short) 7870, Block.WHITE_CARPET);

  public static void initStates() {
    Block.WHITE_CARPET.addBlockState(WHITE_CARPET_0);
  }
}
