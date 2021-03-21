package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RedstoneOre {
  public static final BlockState REDSTONE_ORE_0 = new BlockState((short) 3885, Block.REDSTONE_ORE);

  public static final BlockState REDSTONE_ORE_1 = new BlockState((short) 3886, Block.REDSTONE_ORE);

  public static void initStates() {
    Block.REDSTONE_ORE.addBlockState(REDSTONE_ORE_0);
    Block.REDSTONE_ORE.addBlockState(REDSTONE_ORE_1);
  }
}
