package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrimsonHyphae {
  public static final BlockState CRIMSON_HYPHAE_0 = new BlockState((short) 14989, Block.CRIMSON_HYPHAE);

  public static final BlockState CRIMSON_HYPHAE_1 = new BlockState((short) 14990, Block.CRIMSON_HYPHAE);

  public static final BlockState CRIMSON_HYPHAE_2 = new BlockState((short) 14991, Block.CRIMSON_HYPHAE);

  public static void initStates() {
    Block.CRIMSON_HYPHAE.addBlockState(CRIMSON_HYPHAE_0);
    Block.CRIMSON_HYPHAE.addBlockState(CRIMSON_HYPHAE_1);
    Block.CRIMSON_HYPHAE.addBlockState(CRIMSON_HYPHAE_2);
  }
}
