package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Melon {
  public static final BlockState MELON_0 = new BlockState((short) 4767, Block.MELON);

  public static void initStates() {
    Block.MELON.addBlockState(MELON_0);
  }
}
