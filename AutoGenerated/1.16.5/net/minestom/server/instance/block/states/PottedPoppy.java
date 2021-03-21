package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedPoppy {
  public static final BlockState POTTED_POPPY_0 = new BlockState((short) 6318, Block.POTTED_POPPY);

  public static void initStates() {
    Block.POTTED_POPPY.addBlockState(POTTED_POPPY_0);
  }
}
