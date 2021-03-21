package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WeepingVinesPlant {
  public static final BlockState WEEPING_VINES_PLANT_0 = new BlockState((short) 15024, Block.WEEPING_VINES_PLANT);

  public static void initStates() {
    Block.WEEPING_VINES_PLANT.addBlockState(WEEPING_VINES_PLANT_0);
  }
}
