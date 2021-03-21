package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedstoneWallTorch {
  public static final BlockState REDSTONE_WALL_TORCH_0 = new BlockState((short) 3889, Block.REDSTONE_WALL_TORCH);

  public static final BlockState REDSTONE_WALL_TORCH_1 = new BlockState((short) 3890, Block.REDSTONE_WALL_TORCH);

  public static final BlockState REDSTONE_WALL_TORCH_2 = new BlockState((short) 3891, Block.REDSTONE_WALL_TORCH);

  public static final BlockState REDSTONE_WALL_TORCH_3 = new BlockState((short) 3892, Block.REDSTONE_WALL_TORCH);

  public static final BlockState REDSTONE_WALL_TORCH_4 = new BlockState((short) 3893, Block.REDSTONE_WALL_TORCH);

  public static final BlockState REDSTONE_WALL_TORCH_5 = new BlockState((short) 3894, Block.REDSTONE_WALL_TORCH);

  public static final BlockState REDSTONE_WALL_TORCH_6 = new BlockState((short) 3895, Block.REDSTONE_WALL_TORCH);

  public static final BlockState REDSTONE_WALL_TORCH_7 = new BlockState((short) 3896, Block.REDSTONE_WALL_TORCH);

  public static void initStates() {
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_0);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_1);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_2);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_3);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_4);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_5);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_6);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_7);
  }
}
