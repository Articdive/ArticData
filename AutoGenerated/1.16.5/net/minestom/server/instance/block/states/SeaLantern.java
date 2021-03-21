package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SeaLantern {
  public static final BlockState SEA_LANTERN_0 = new BlockState((short) 7866, Block.SEA_LANTERN);

  public static void initStates() {
    Block.SEA_LANTERN.addBlockState(SEA_LANTERN_0);
  }
}
