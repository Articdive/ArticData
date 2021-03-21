package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrimsonRoots {
  public static final BlockState CRIMSON_ROOTS_0 = new BlockState((short) 15052, Block.CRIMSON_ROOTS);

  public static void initStates() {
    Block.CRIMSON_ROOTS.addBlockState(CRIMSON_ROOTS_0);
  }
}
