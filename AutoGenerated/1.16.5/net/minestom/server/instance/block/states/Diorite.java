package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Diorite {
  public static final BlockState DIORITE_0 = new BlockState((short) 4, Block.DIORITE);

  public static void initStates() {
    Block.DIORITE.addBlockState(DIORITE_0);
  }
}
