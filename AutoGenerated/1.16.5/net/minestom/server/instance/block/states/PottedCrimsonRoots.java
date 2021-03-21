package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedCrimsonRoots {
  public static final BlockState POTTED_CRIMSON_ROOTS_0 = new BlockState((short) 15844, Block.POTTED_CRIMSON_ROOTS);

  public static void initStates() {
    Block.POTTED_CRIMSON_ROOTS.addBlockState(POTTED_CRIMSON_ROOTS_0);
  }
}
