package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StonePressurePlate {
  public static final BlockState STONE_PRESSURE_PLATE_0 = new BlockState((short) 3807, Block.STONE_PRESSURE_PLATE);

  public static final BlockState STONE_PRESSURE_PLATE_1 = new BlockState((short) 3808, Block.STONE_PRESSURE_PLATE);

  public static void initStates() {
    Block.STONE_PRESSURE_PLATE.addBlockState(STONE_PRESSURE_PLATE_0);
    Block.STONE_PRESSURE_PLATE.addBlockState(STONE_PRESSURE_PLATE_1);
  }
}
