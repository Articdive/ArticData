package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RoseBush {
  public static final BlockState ROSE_BUSH_0 = new BlockState((short) 7893, Block.ROSE_BUSH);

  public static final BlockState ROSE_BUSH_1 = new BlockState((short) 7894, Block.ROSE_BUSH);

  public static void initStates() {
    Block.ROSE_BUSH.addBlockState(ROSE_BUSH_0);
    Block.ROSE_BUSH.addBlockState(ROSE_BUSH_1);
  }
}
