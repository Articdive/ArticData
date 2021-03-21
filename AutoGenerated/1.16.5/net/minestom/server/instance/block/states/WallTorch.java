package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WallTorch {
  public static final BlockState WALL_TORCH_0 = new BlockState((short) 1436, Block.WALL_TORCH);

  public static final BlockState WALL_TORCH_1 = new BlockState((short) 1437, Block.WALL_TORCH);

  public static final BlockState WALL_TORCH_2 = new BlockState((short) 1438, Block.WALL_TORCH);

  public static final BlockState WALL_TORCH_3 = new BlockState((short) 1439, Block.WALL_TORCH);

  public static void initStates() {
    Block.WALL_TORCH.addBlockState(WALL_TORCH_0);
    Block.WALL_TORCH.addBlockState(WALL_TORCH_1);
    Block.WALL_TORCH.addBlockState(WALL_TORCH_2);
    Block.WALL_TORCH.addBlockState(WALL_TORCH_3);
  }
}
