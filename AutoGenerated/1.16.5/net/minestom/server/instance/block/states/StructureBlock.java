package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StructureBlock {
  public static final BlockState STRUCTURE_BLOCK_0 = new BlockState((short) 15743, Block.STRUCTURE_BLOCK);

  public static final BlockState STRUCTURE_BLOCK_1 = new BlockState((short) 15744, Block.STRUCTURE_BLOCK);

  public static final BlockState STRUCTURE_BLOCK_2 = new BlockState((short) 15745, Block.STRUCTURE_BLOCK);

  public static final BlockState STRUCTURE_BLOCK_3 = new BlockState((short) 15746, Block.STRUCTURE_BLOCK);

  public static void initStates() {
    Block.STRUCTURE_BLOCK.addBlockState(STRUCTURE_BLOCK_0);
    Block.STRUCTURE_BLOCK.addBlockState(STRUCTURE_BLOCK_1);
    Block.STRUCTURE_BLOCK.addBlockState(STRUCTURE_BLOCK_2);
    Block.STRUCTURE_BLOCK.addBlockState(STRUCTURE_BLOCK_3);
  }
}
