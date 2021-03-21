package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedWarpedHyphae {
  public static final BlockState STRIPPED_WARPED_HYPHAE_0 = new BlockState((short) 14975, Block.STRIPPED_WARPED_HYPHAE);

  public static final BlockState STRIPPED_WARPED_HYPHAE_1 = new BlockState((short) 14976, Block.STRIPPED_WARPED_HYPHAE);

  public static final BlockState STRIPPED_WARPED_HYPHAE_2 = new BlockState((short) 14977, Block.STRIPPED_WARPED_HYPHAE);

  public static void initStates() {
    Block.STRIPPED_WARPED_HYPHAE.addBlockState(STRIPPED_WARPED_HYPHAE_0);
    Block.STRIPPED_WARPED_HYPHAE.addBlockState(STRIPPED_WARPED_HYPHAE_1);
    Block.STRIPPED_WARPED_HYPHAE.addBlockState(STRIPPED_WARPED_HYPHAE_2);
  }
}
