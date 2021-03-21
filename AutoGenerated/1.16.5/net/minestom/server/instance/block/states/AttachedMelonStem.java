package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AttachedMelonStem {
  public static final BlockState ATTACHED_MELON_STEM_0 = new BlockState((short) 4772, Block.ATTACHED_MELON_STEM);

  public static final BlockState ATTACHED_MELON_STEM_1 = new BlockState((short) 4773, Block.ATTACHED_MELON_STEM);

  public static final BlockState ATTACHED_MELON_STEM_2 = new BlockState((short) 4774, Block.ATTACHED_MELON_STEM);

  public static final BlockState ATTACHED_MELON_STEM_3 = new BlockState((short) 4775, Block.ATTACHED_MELON_STEM);

  public static void initStates() {
    Block.ATTACHED_MELON_STEM.addBlockState(ATTACHED_MELON_STEM_0);
    Block.ATTACHED_MELON_STEM.addBlockState(ATTACHED_MELON_STEM_1);
    Block.ATTACHED_MELON_STEM.addBlockState(ATTACHED_MELON_STEM_2);
    Block.ATTACHED_MELON_STEM.addBlockState(ATTACHED_MELON_STEM_3);
  }
}
