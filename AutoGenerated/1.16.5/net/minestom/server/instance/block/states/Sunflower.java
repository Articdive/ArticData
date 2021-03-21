package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Sunflower {
  public static final BlockState SUNFLOWER_0 = new BlockState((short) 7889, Block.SUNFLOWER);

  public static final BlockState SUNFLOWER_1 = new BlockState((short) 7890, Block.SUNFLOWER);

  public static void initStates() {
    Block.SUNFLOWER.addBlockState(SUNFLOWER_0);
    Block.SUNFLOWER.addBlockState(SUNFLOWER_1);
  }
}
