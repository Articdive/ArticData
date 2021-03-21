package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedOxeyeDaisy {
  public static final BlockState POTTED_OXEYE_DAISY_0 = new BlockState((short) 6326, Block.POTTED_OXEYE_DAISY);

  public static void initStates() {
    Block.POTTED_OXEYE_DAISY.addBlockState(POTTED_OXEYE_DAISY_0);
  }
}
