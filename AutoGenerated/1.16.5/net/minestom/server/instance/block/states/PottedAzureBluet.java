package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedAzureBluet {
  public static final BlockState POTTED_AZURE_BLUET_0 = new BlockState((short) 6321, Block.POTTED_AZURE_BLUET);

  public static void initStates() {
    Block.POTTED_AZURE_BLUET.addBlockState(POTTED_AZURE_BLUET_0);
  }
}
