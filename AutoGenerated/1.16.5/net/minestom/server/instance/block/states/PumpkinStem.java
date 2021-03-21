package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PumpkinStem {
  public static final BlockState PUMPKIN_STEM_0 = new BlockState((short) 4776, Block.PUMPKIN_STEM);

  public static final BlockState PUMPKIN_STEM_1 = new BlockState((short) 4777, Block.PUMPKIN_STEM);

  public static final BlockState PUMPKIN_STEM_2 = new BlockState((short) 4778, Block.PUMPKIN_STEM);

  public static final BlockState PUMPKIN_STEM_3 = new BlockState((short) 4779, Block.PUMPKIN_STEM);

  public static final BlockState PUMPKIN_STEM_4 = new BlockState((short) 4780, Block.PUMPKIN_STEM);

  public static final BlockState PUMPKIN_STEM_5 = new BlockState((short) 4781, Block.PUMPKIN_STEM);

  public static final BlockState PUMPKIN_STEM_6 = new BlockState((short) 4782, Block.PUMPKIN_STEM);

  public static final BlockState PUMPKIN_STEM_7 = new BlockState((short) 4783, Block.PUMPKIN_STEM);

  public static void initStates() {
    Block.PUMPKIN_STEM.addBlockState(PUMPKIN_STEM_0);
    Block.PUMPKIN_STEM.addBlockState(PUMPKIN_STEM_1);
    Block.PUMPKIN_STEM.addBlockState(PUMPKIN_STEM_2);
    Block.PUMPKIN_STEM.addBlockState(PUMPKIN_STEM_3);
    Block.PUMPKIN_STEM.addBlockState(PUMPKIN_STEM_4);
    Block.PUMPKIN_STEM.addBlockState(PUMPKIN_STEM_5);
    Block.PUMPKIN_STEM.addBlockState(PUMPKIN_STEM_6);
    Block.PUMPKIN_STEM.addBlockState(PUMPKIN_STEM_7);
  }
}
