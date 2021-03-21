package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OakPressurePlate {
  public static final BlockState OAK_PRESSURE_PLATE_0 = new BlockState((short) 3873, Block.OAK_PRESSURE_PLATE);

  public static final BlockState OAK_PRESSURE_PLATE_1 = new BlockState((short) 3874, Block.OAK_PRESSURE_PLATE);

  public static void initStates() {
    Block.OAK_PRESSURE_PLATE.addBlockState(OAK_PRESSURE_PLATE_0);
    Block.OAK_PRESSURE_PLATE.addBlockState(OAK_PRESSURE_PLATE_1);
  }
}
