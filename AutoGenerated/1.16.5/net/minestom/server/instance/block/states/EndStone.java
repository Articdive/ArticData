package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EndStone {
  public static final BlockState END_STONE_0 = new BlockState((short) 5158, Block.END_STONE);

  public static void initStates() {
    Block.END_STONE.addBlockState(END_STONE_0);
  }
}
