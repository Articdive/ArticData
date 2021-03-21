package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DarkOakPressurePlate {
  public static final BlockState DARK_OAK_PRESSURE_PLATE_0 = new BlockState((short) 3883, Block.DARK_OAK_PRESSURE_PLATE);

  public static final BlockState DARK_OAK_PRESSURE_PLATE_1 = new BlockState((short) 3884, Block.DARK_OAK_PRESSURE_PLATE);

  public static void initStates() {
    Block.DARK_OAK_PRESSURE_PLATE.addBlockState(DARK_OAK_PRESSURE_PLATE_0);
    Block.DARK_OAK_PRESSURE_PLATE.addBlockState(DARK_OAK_PRESSURE_PLATE_1);
  }
}
