package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Podzol {
  public static final BlockState PODZOL_0 = new BlockState((short) 12, Block.PODZOL);

  public static final BlockState PODZOL_1 = new BlockState((short) 13, Block.PODZOL);

  public static void initStates() {
    Block.PODZOL.addBlockState(PODZOL_0);
    Block.PODZOL.addBlockState(PODZOL_1);
  }
}
