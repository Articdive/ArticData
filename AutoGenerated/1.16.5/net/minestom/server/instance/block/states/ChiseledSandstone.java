package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class ChiseledSandstone {
  public static final BlockState CHISELED_SANDSTONE_0 = new BlockState((short) 247, Block.CHISELED_SANDSTONE);

  public static void initStates() {
    Block.CHISELED_SANDSTONE.addBlockState(CHISELED_SANDSTONE_0);
  }
}
