package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Lilac {
  public static final BlockState LILAC_0 = new BlockState((short) 7891, Block.LILAC);

  public static final BlockState LILAC_1 = new BlockState((short) 7892, Block.LILAC);

  public static void initStates() {
    Block.LILAC.addBlockState(LILAC_0);
    Block.LILAC.addBlockState(LILAC_1);
  }
}
