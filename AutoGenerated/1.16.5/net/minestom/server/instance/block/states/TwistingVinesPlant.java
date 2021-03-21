package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class TwistingVinesPlant {
  public static final BlockState TWISTING_VINES_PLANT_0 = new BlockState((short) 15051, Block.TWISTING_VINES_PLANT);

  public static void initStates() {
    Block.TWISTING_VINES_PLANT.addBlockState(TWISTING_VINES_PLANT_0);
  }
}
