package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedCrimsonHyphae {
  public static final BlockState STRIPPED_CRIMSON_HYPHAE_0 = new BlockState((short) 14992, Block.STRIPPED_CRIMSON_HYPHAE);

  public static final BlockState STRIPPED_CRIMSON_HYPHAE_1 = new BlockState((short) 14993, Block.STRIPPED_CRIMSON_HYPHAE);

  public static final BlockState STRIPPED_CRIMSON_HYPHAE_2 = new BlockState((short) 14994, Block.STRIPPED_CRIMSON_HYPHAE);

  public static void initStates() {
    Block.STRIPPED_CRIMSON_HYPHAE.addBlockState(STRIPPED_CRIMSON_HYPHAE_0);
    Block.STRIPPED_CRIMSON_HYPHAE.addBlockState(STRIPPED_CRIMSON_HYPHAE_1);
    Block.STRIPPED_CRIMSON_HYPHAE.addBlockState(STRIPPED_CRIMSON_HYPHAE_2);
  }
}
