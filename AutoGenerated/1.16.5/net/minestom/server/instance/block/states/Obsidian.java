package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Obsidian {
  public static final BlockState OBSIDIAN_0 = new BlockState((short) 1434, Block.OBSIDIAN);

  public static void initStates() {
    Block.OBSIDIAN.addBlockState(OBSIDIAN_0);
  }
}
