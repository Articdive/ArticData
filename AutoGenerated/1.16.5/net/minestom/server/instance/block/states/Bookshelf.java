package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Bookshelf {
  public static final BlockState BOOKSHELF_0 = new BlockState((short) 1432, Block.BOOKSHELF);

  public static void initStates() {
    Block.BOOKSHELF.addBlockState(BOOKSHELF_0);
  }
}
