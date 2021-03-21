package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AttachedPumpkinStem {
  public static final BlockState ATTACHED_PUMPKIN_STEM_0 = new BlockState((short) 4768, Block.ATTACHED_PUMPKIN_STEM);

  public static final BlockState ATTACHED_PUMPKIN_STEM_1 = new BlockState((short) 4769, Block.ATTACHED_PUMPKIN_STEM);

  public static final BlockState ATTACHED_PUMPKIN_STEM_2 = new BlockState((short) 4770, Block.ATTACHED_PUMPKIN_STEM);

  public static final BlockState ATTACHED_PUMPKIN_STEM_3 = new BlockState((short) 4771, Block.ATTACHED_PUMPKIN_STEM);

  public static void initStates() {
    Block.ATTACHED_PUMPKIN_STEM.addBlockState(ATTACHED_PUMPKIN_STEM_0);
    Block.ATTACHED_PUMPKIN_STEM.addBlockState(ATTACHED_PUMPKIN_STEM_1);
    Block.ATTACHED_PUMPKIN_STEM.addBlockState(ATTACHED_PUMPKIN_STEM_2);
    Block.ATTACHED_PUMPKIN_STEM.addBlockState(ATTACHED_PUMPKIN_STEM_3);
  }
}
