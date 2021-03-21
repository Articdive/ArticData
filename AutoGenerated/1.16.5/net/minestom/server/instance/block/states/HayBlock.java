package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class HayBlock {
  public static final BlockState HAY_BLOCK_0 = new BlockState((short) 7867, Block.HAY_BLOCK);

  public static final BlockState HAY_BLOCK_1 = new BlockState((short) 7868, Block.HAY_BLOCK);

  public static final BlockState HAY_BLOCK_2 = new BlockState((short) 7869, Block.HAY_BLOCK);

  public static void initStates() {
    Block.HAY_BLOCK.addBlockState(HAY_BLOCK_0);
    Block.HAY_BLOCK.addBlockState(HAY_BLOCK_1);
    Block.HAY_BLOCK.addBlockState(HAY_BLOCK_2);
  }
}
