package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BoneBlock {
  public static final BlockState BONE_BLOCK_0 = new BlockState((short) 9260, Block.BONE_BLOCK);

  public static final BlockState BONE_BLOCK_1 = new BlockState((short) 9261, Block.BONE_BLOCK);

  public static final BlockState BONE_BLOCK_2 = new BlockState((short) 9262, Block.BONE_BLOCK);

  public static void initStates() {
    Block.BONE_BLOCK.addBlockState(BONE_BLOCK_0);
    Block.BONE_BLOCK.addBlockState(BONE_BLOCK_1);
    Block.BONE_BLOCK.addBlockState(BONE_BLOCK_2);
  }
}
