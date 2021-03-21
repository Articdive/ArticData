package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PolishedBlackstonePressurePlate {
  public static final BlockState POLISHED_BLACKSTONE_PRESSURE_PLATE_0 = new BlockState((short) 16759, Block.POLISHED_BLACKSTONE_PRESSURE_PLATE);

  public static final BlockState POLISHED_BLACKSTONE_PRESSURE_PLATE_1 = new BlockState((short) 16760, Block.POLISHED_BLACKSTONE_PRESSURE_PLATE);

  public static void initStates() {
    Block.POLISHED_BLACKSTONE_PRESSURE_PLATE.addBlockState(POLISHED_BLACKSTONE_PRESSURE_PLATE_0);
    Block.POLISHED_BLACKSTONE_PRESSURE_PLATE.addBlockState(POLISHED_BLACKSTONE_PRESSURE_PLATE_1);
  }
}
