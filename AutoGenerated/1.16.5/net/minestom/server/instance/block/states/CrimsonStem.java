package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrimsonStem {
  public static final BlockState CRIMSON_STEM_0 = new BlockState((short) 14983, Block.CRIMSON_STEM);

  public static final BlockState CRIMSON_STEM_1 = new BlockState((short) 14984, Block.CRIMSON_STEM);

  public static final BlockState CRIMSON_STEM_2 = new BlockState((short) 14985, Block.CRIMSON_STEM);

  public static void initStates() {
    Block.CRIMSON_STEM.addBlockState(CRIMSON_STEM_0);
    Block.CRIMSON_STEM.addBlockState(CRIMSON_STEM_1);
    Block.CRIMSON_STEM.addBlockState(CRIMSON_STEM_2);
  }
}
