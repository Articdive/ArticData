package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BirchPressurePlate {
  public static final BlockState BIRCH_PRESSURE_PLATE_0 = new BlockState((short) 3877, Block.BIRCH_PRESSURE_PLATE);

  public static final BlockState BIRCH_PRESSURE_PLATE_1 = new BlockState((short) 3878, Block.BIRCH_PRESSURE_PLATE);

  public static void initStates() {
    Block.BIRCH_PRESSURE_PLATE.addBlockState(BIRCH_PRESSURE_PLATE_0);
    Block.BIRCH_PRESSURE_PLATE.addBlockState(BIRCH_PRESSURE_PLATE_1);
  }
}
