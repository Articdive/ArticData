package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PrismarineBricks {
  public static final BlockState PRISMARINE_BRICKS_0 = new BlockState((short) 7606, Block.PRISMARINE_BRICKS);

  public static void initStates() {
    Block.PRISMARINE_BRICKS.addBlockState(PRISMARINE_BRICKS_0);
  }
}
