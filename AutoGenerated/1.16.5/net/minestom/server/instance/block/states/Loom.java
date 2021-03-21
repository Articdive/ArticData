package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Loom {
  public static final BlockState LOOM_0 = new BlockState((short) 14791, Block.LOOM);

  public static final BlockState LOOM_1 = new BlockState((short) 14792, Block.LOOM);

  public static final BlockState LOOM_2 = new BlockState((short) 14793, Block.LOOM);

  public static final BlockState LOOM_3 = new BlockState((short) 14794, Block.LOOM);

  public static void initStates() {
    Block.LOOM.addBlockState(LOOM_0);
    Block.LOOM.addBlockState(LOOM_1);
    Block.LOOM.addBlockState(LOOM_2);
    Block.LOOM.addBlockState(LOOM_3);
  }
}
