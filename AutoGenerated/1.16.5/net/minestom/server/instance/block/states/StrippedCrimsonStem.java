package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedCrimsonStem {
  public static final BlockState STRIPPED_CRIMSON_STEM_0 = new BlockState((short) 14986, Block.STRIPPED_CRIMSON_STEM);

  public static final BlockState STRIPPED_CRIMSON_STEM_1 = new BlockState((short) 14987, Block.STRIPPED_CRIMSON_STEM);

  public static final BlockState STRIPPED_CRIMSON_STEM_2 = new BlockState((short) 14988, Block.STRIPPED_CRIMSON_STEM);

  public static void initStates() {
    Block.STRIPPED_CRIMSON_STEM.addBlockState(STRIPPED_CRIMSON_STEM_0);
    Block.STRIPPED_CRIMSON_STEM.addBlockState(STRIPPED_CRIMSON_STEM_1);
    Block.STRIPPED_CRIMSON_STEM.addBlockState(STRIPPED_CRIMSON_STEM_2);
  }
}
