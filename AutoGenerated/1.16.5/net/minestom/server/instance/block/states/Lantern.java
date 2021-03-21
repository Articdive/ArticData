package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Lantern {
  public static final BlockState LANTERN_0 = new BlockState((short) 14890, Block.LANTERN);

  public static final BlockState LANTERN_1 = new BlockState((short) 14891, Block.LANTERN);

  public static final BlockState LANTERN_2 = new BlockState((short) 14892, Block.LANTERN);

  public static final BlockState LANTERN_3 = new BlockState((short) 14893, Block.LANTERN);

  public static void initStates() {
    Block.LANTERN.addBlockState(LANTERN_0);
    Block.LANTERN.addBlockState(LANTERN_1);
    Block.LANTERN.addBlockState(LANTERN_2);
    Block.LANTERN.addBlockState(LANTERN_3);
  }
}
