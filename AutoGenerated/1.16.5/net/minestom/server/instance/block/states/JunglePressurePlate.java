package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class JunglePressurePlate {
  public static final BlockState JUNGLE_PRESSURE_PLATE_0 = new BlockState((short) 3879, Block.JUNGLE_PRESSURE_PLATE);

  public static final BlockState JUNGLE_PRESSURE_PLATE_1 = new BlockState((short) 3880, Block.JUNGLE_PRESSURE_PLATE);

  public static void initStates() {
    Block.JUNGLE_PRESSURE_PLATE.addBlockState(JUNGLE_PRESSURE_PLATE_0);
    Block.JUNGLE_PRESSURE_PLATE.addBlockState(JUNGLE_PRESSURE_PLATE_1);
  }
}
