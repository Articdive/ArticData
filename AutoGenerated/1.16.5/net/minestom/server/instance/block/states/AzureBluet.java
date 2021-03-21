package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AzureBluet {
  public static final BlockState AZURE_BLUET_0 = new BlockState((short) 1416, Block.AZURE_BLUET);

  public static void initStates() {
    Block.AZURE_BLUET.addBlockState(AZURE_BLUET_0);
  }
}
