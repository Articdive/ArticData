package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SoulWallTorch {
  public static final BlockState SOUL_WALL_TORCH_0 = new BlockState((short) 4009, Block.SOUL_WALL_TORCH);

  public static final BlockState SOUL_WALL_TORCH_1 = new BlockState((short) 4010, Block.SOUL_WALL_TORCH);

  public static final BlockState SOUL_WALL_TORCH_2 = new BlockState((short) 4011, Block.SOUL_WALL_TORCH);

  public static final BlockState SOUL_WALL_TORCH_3 = new BlockState((short) 4012, Block.SOUL_WALL_TORCH);

  public static void initStates() {
    Block.SOUL_WALL_TORCH.addBlockState(SOUL_WALL_TORCH_0);
    Block.SOUL_WALL_TORCH.addBlockState(SOUL_WALL_TORCH_1);
    Block.SOUL_WALL_TORCH.addBlockState(SOUL_WALL_TORCH_2);
    Block.SOUL_WALL_TORCH.addBlockState(SOUL_WALL_TORCH_3);
  }
}
