package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrimsonPressurePlate {
  public static final BlockState CRIMSON_PRESSURE_PLATE_0 = new BlockState((short) 15067, Block.CRIMSON_PRESSURE_PLATE);

  public static final BlockState CRIMSON_PRESSURE_PLATE_1 = new BlockState((short) 15068, Block.CRIMSON_PRESSURE_PLATE);

  public static void initStates() {
    Block.CRIMSON_PRESSURE_PLATE.addBlockState(CRIMSON_PRESSURE_PLATE_0);
    Block.CRIMSON_PRESSURE_PLATE.addBlockState(CRIMSON_PRESSURE_PLATE_1);
  }
}
