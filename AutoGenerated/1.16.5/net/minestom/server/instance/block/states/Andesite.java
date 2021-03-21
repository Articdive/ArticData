package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Andesite {
  public static final BlockState ANDESITE_0 = new BlockState((short) 6, Block.ANDESITE);

  public static void initStates() {
    Block.ANDESITE.addBlockState(ANDESITE_0);
  }
}
