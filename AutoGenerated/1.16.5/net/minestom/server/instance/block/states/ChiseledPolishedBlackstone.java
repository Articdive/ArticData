package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class ChiseledPolishedBlackstone {
  public static final BlockState CHISELED_POLISHED_BLACKSTONE_0 = new BlockState((short) 16261, Block.CHISELED_POLISHED_BLACKSTONE);

  public static void initStates() {
    Block.CHISELED_POLISHED_BLACKSTONE.addBlockState(CHISELED_POLISHED_BLACKSTONE_0);
  }
}
