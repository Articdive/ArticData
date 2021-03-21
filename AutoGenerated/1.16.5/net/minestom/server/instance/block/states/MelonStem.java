package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class MelonStem {
  public static final BlockState MELON_STEM_0 = new BlockState((short) 4784, Block.MELON_STEM);

  public static final BlockState MELON_STEM_1 = new BlockState((short) 4785, Block.MELON_STEM);

  public static final BlockState MELON_STEM_2 = new BlockState((short) 4786, Block.MELON_STEM);

  public static final BlockState MELON_STEM_3 = new BlockState((short) 4787, Block.MELON_STEM);

  public static final BlockState MELON_STEM_4 = new BlockState((short) 4788, Block.MELON_STEM);

  public static final BlockState MELON_STEM_5 = new BlockState((short) 4789, Block.MELON_STEM);

  public static final BlockState MELON_STEM_6 = new BlockState((short) 4790, Block.MELON_STEM);

  public static final BlockState MELON_STEM_7 = new BlockState((short) 4791, Block.MELON_STEM);

  public static void initStates() {
    Block.MELON_STEM.addBlockState(MELON_STEM_0);
    Block.MELON_STEM.addBlockState(MELON_STEM_1);
    Block.MELON_STEM.addBlockState(MELON_STEM_2);
    Block.MELON_STEM.addBlockState(MELON_STEM_3);
    Block.MELON_STEM.addBlockState(MELON_STEM_4);
    Block.MELON_STEM.addBlockState(MELON_STEM_5);
    Block.MELON_STEM.addBlockState(MELON_STEM_6);
    Block.MELON_STEM.addBlockState(MELON_STEM_7);
  }
}
