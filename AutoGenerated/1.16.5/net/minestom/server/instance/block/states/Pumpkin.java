package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Pumpkin {
  public static final BlockState PUMPKIN_0 = new BlockState((short) 3998, Block.PUMPKIN);

  public static void initStates() {
    Block.PUMPKIN.addBlockState(PUMPKIN_0);
  }
}
