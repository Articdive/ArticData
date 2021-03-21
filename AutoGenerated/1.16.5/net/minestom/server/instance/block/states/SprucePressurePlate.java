package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SprucePressurePlate {
  public static final BlockState SPRUCE_PRESSURE_PLATE_0 = new BlockState((short) 3875, Block.SPRUCE_PRESSURE_PLATE);

  public static final BlockState SPRUCE_PRESSURE_PLATE_1 = new BlockState((short) 3876, Block.SPRUCE_PRESSURE_PLATE);

  public static void initStates() {
    Block.SPRUCE_PRESSURE_PLATE.addBlockState(SPRUCE_PRESSURE_PLATE_0);
    Block.SPRUCE_PRESSURE_PLATE.addBlockState(SPRUCE_PRESSURE_PLATE_1);
  }
}
