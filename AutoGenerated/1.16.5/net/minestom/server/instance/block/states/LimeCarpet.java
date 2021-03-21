package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LimeCarpet {
  public static final BlockState LIME_CARPET_0 = new BlockState((short) 7875, Block.LIME_CARPET);

  public static void initStates() {
    Block.LIME_CARPET.addBlockState(LIME_CARPET_0);
  }
}
