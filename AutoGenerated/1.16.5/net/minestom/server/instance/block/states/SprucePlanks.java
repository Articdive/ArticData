package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SprucePlanks {
  public static final BlockState SPRUCE_PLANKS_0 = new BlockState((short) 16, Block.SPRUCE_PLANKS);

  public static void initStates() {
    Block.SPRUCE_PLANKS.addBlockState(SPRUCE_PLANKS_0);
  }
}
