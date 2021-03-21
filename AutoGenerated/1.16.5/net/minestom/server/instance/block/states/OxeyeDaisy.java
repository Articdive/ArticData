package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OxeyeDaisy {
  public static final BlockState OXEYE_DAISY_0 = new BlockState((short) 1421, Block.OXEYE_DAISY);

  public static void initStates() {
    Block.OXEYE_DAISY.addBlockState(OXEYE_DAISY_0);
  }
}
