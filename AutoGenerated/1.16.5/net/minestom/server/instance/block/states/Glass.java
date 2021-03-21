package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Glass {
  public static final BlockState GLASS_0 = new BlockState((short) 231, Block.GLASS);

  public static void initStates() {
    Block.GLASS.addBlockState(GLASS_0);
  }
}
