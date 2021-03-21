package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SoulTorch {
  public static final BlockState SOUL_TORCH_0 = new BlockState((short) 4008, Block.SOUL_TORCH);

  public static void initStates() {
    Block.SOUL_TORCH.addBlockState(SOUL_TORCH_0);
  }
}
