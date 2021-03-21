package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Netherrack {
  public static final BlockState NETHERRACK_0 = new BlockState((short) 3999, Block.NETHERRACK);

  public static void initStates() {
    Block.NETHERRACK.addBlockState(NETHERRACK_0);
  }
}
