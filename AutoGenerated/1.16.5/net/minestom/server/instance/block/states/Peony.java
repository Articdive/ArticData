package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Peony {
  public static final BlockState PEONY_0 = new BlockState((short) 7895, Block.PEONY);

  public static final BlockState PEONY_1 = new BlockState((short) 7896, Block.PEONY);

  public static void initStates() {
    Block.PEONY.addBlockState(PEONY_0);
    Block.PEONY.addBlockState(PEONY_1);
  }
}
