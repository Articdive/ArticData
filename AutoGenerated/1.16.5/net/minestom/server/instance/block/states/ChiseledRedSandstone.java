package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class ChiseledRedSandstone {
  public static final BlockState CHISELED_RED_SANDSTONE_0 = new BlockState((short) 8222, Block.CHISELED_RED_SANDSTONE);

  public static void initStates() {
    Block.CHISELED_RED_SANDSTONE.addBlockState(CHISELED_RED_SANDSTONE_0);
  }
}
