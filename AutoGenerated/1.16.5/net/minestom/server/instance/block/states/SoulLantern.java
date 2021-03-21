package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SoulLantern {
  public static final BlockState SOUL_LANTERN_0 = new BlockState((short) 14894, Block.SOUL_LANTERN);

  public static final BlockState SOUL_LANTERN_1 = new BlockState((short) 14895, Block.SOUL_LANTERN);

  public static final BlockState SOUL_LANTERN_2 = new BlockState((short) 14896, Block.SOUL_LANTERN);

  public static final BlockState SOUL_LANTERN_3 = new BlockState((short) 14897, Block.SOUL_LANTERN);

  public static void initStates() {
    Block.SOUL_LANTERN.addBlockState(SOUL_LANTERN_0);
    Block.SOUL_LANTERN.addBlockState(SOUL_LANTERN_1);
    Block.SOUL_LANTERN.addBlockState(SOUL_LANTERN_2);
    Block.SOUL_LANTERN.addBlockState(SOUL_LANTERN_3);
  }
}
