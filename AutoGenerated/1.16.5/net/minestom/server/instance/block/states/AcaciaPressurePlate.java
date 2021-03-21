package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class AcaciaPressurePlate {
  public static final BlockState ACACIA_PRESSURE_PLATE_0 = new BlockState((short) 3881, Block.ACACIA_PRESSURE_PLATE);

  public static final BlockState ACACIA_PRESSURE_PLATE_1 = new BlockState((short) 3882, Block.ACACIA_PRESSURE_PLATE);

  public static void initStates() {
    Block.ACACIA_PRESSURE_PLATE.addBlockState(ACACIA_PRESSURE_PLATE_0);
    Block.ACACIA_PRESSURE_PLATE.addBlockState(ACACIA_PRESSURE_PLATE_1);
  }
}
