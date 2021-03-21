package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Jukebox {
  public static final BlockState JUKEBOX_0 = new BlockState((short) 3964, Block.JUKEBOX);

  public static final BlockState JUKEBOX_1 = new BlockState((short) 3965, Block.JUKEBOX);

  public static void initStates() {
    Block.JUKEBOX.addBlockState(JUKEBOX_0);
    Block.JUKEBOX.addBlockState(JUKEBOX_1);
  }
}
