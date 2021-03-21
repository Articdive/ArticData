package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Torch {
  public static final BlockState TORCH_0 = new BlockState((short) 1435, Block.TORCH);

  public static void initStates() {
    Block.TORCH.addBlockState(TORCH_0);
  }
}
