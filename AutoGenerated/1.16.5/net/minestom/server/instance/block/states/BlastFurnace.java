package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BlastFurnace {
  public static final BlockState BLAST_FURNACE_0 = new BlockState((short) 14815, Block.BLAST_FURNACE);

  public static final BlockState BLAST_FURNACE_1 = new BlockState((short) 14816, Block.BLAST_FURNACE);

  public static final BlockState BLAST_FURNACE_2 = new BlockState((short) 14817, Block.BLAST_FURNACE);

  public static final BlockState BLAST_FURNACE_3 = new BlockState((short) 14818, Block.BLAST_FURNACE);

  public static final BlockState BLAST_FURNACE_4 = new BlockState((short) 14819, Block.BLAST_FURNACE);

  public static final BlockState BLAST_FURNACE_5 = new BlockState((short) 14820, Block.BLAST_FURNACE);

  public static final BlockState BLAST_FURNACE_6 = new BlockState((short) 14821, Block.BLAST_FURNACE);

  public static final BlockState BLAST_FURNACE_7 = new BlockState((short) 14822, Block.BLAST_FURNACE);

  public static void initStates() {
    Block.BLAST_FURNACE.addBlockState(BLAST_FURNACE_0);
    Block.BLAST_FURNACE.addBlockState(BLAST_FURNACE_1);
    Block.BLAST_FURNACE.addBlockState(BLAST_FURNACE_2);
    Block.BLAST_FURNACE.addBlockState(BLAST_FURNACE_3);
    Block.BLAST_FURNACE.addBlockState(BLAST_FURNACE_4);
    Block.BLAST_FURNACE.addBlockState(BLAST_FURNACE_5);
    Block.BLAST_FURNACE.addBlockState(BLAST_FURNACE_6);
    Block.BLAST_FURNACE.addBlockState(BLAST_FURNACE_7);
  }
}
