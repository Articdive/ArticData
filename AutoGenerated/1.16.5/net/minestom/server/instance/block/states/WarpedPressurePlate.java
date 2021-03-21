package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WarpedPressurePlate {
  public static final BlockState WARPED_PRESSURE_PLATE_0 = new BlockState((short) 15069, Block.WARPED_PRESSURE_PLATE);

  public static final BlockState WARPED_PRESSURE_PLATE_1 = new BlockState((short) 15070, Block.WARPED_PRESSURE_PLATE);

  public static void initStates() {
    Block.WARPED_PRESSURE_PLATE.addBlockState(WARPED_PRESSURE_PLATE_0);
    Block.WARPED_PRESSURE_PLATE.addBlockState(WARPED_PRESSURE_PLATE_1);
  }
}
