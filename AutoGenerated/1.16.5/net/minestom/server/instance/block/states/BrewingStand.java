package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class BrewingStand {
  public static final BlockState BREWING_STAND_0 = new BlockState((short) 5137, Block.BREWING_STAND);

  public static final BlockState BREWING_STAND_1 = new BlockState((short) 5138, Block.BREWING_STAND);

  public static final BlockState BREWING_STAND_2 = new BlockState((short) 5139, Block.BREWING_STAND);

  public static final BlockState BREWING_STAND_3 = new BlockState((short) 5140, Block.BREWING_STAND);

  public static final BlockState BREWING_STAND_4 = new BlockState((short) 5141, Block.BREWING_STAND);

  public static final BlockState BREWING_STAND_5 = new BlockState((short) 5142, Block.BREWING_STAND);

  public static final BlockState BREWING_STAND_6 = new BlockState((short) 5143, Block.BREWING_STAND);

  public static final BlockState BREWING_STAND_7 = new BlockState((short) 5144, Block.BREWING_STAND);

  public static void initStates() {
    Block.BREWING_STAND.addBlockState(BREWING_STAND_0);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_1);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_2);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_3);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_4);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_5);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_6);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_7);
  }
}
