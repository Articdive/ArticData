package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedstoneTorch {
  public static final BlockState REDSTONE_TORCH_0 = new BlockState((short) 3887, Block.REDSTONE_TORCH);

  public static final BlockState REDSTONE_TORCH_1 = new BlockState((short) 3888, Block.REDSTONE_TORCH);

  public static void initStates() {
    Block.REDSTONE_TORCH.addBlockState(REDSTONE_TORCH_0);
    Block.REDSTONE_TORCH.addBlockState(REDSTONE_TORCH_1);
  }
}
