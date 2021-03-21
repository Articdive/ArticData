package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class InfestedStone {
  public static final BlockState INFESTED_STONE_0 = new BlockState((short) 4499, Block.INFESTED_STONE);

  public static void initStates() {
    Block.INFESTED_STONE.addBlockState(INFESTED_STONE_0);
  }
}
