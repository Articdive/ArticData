package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WarpedHyphae {
  public static final BlockState WARPED_HYPHAE_0 = new BlockState((short) 14972, Block.WARPED_HYPHAE);

  public static final BlockState WARPED_HYPHAE_1 = new BlockState((short) 14973, Block.WARPED_HYPHAE);

  public static final BlockState WARPED_HYPHAE_2 = new BlockState((short) 14974, Block.WARPED_HYPHAE);

  public static void initStates() {
    Block.WARPED_HYPHAE.addBlockState(WARPED_HYPHAE_0);
    Block.WARPED_HYPHAE.addBlockState(WARPED_HYPHAE_1);
    Block.WARPED_HYPHAE.addBlockState(WARPED_HYPHAE_2);
  }
}
