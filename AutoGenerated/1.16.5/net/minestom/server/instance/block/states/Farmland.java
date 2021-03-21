package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Farmland {
  public static final BlockState FARMLAND_0 = new BlockState((short) 3365, Block.FARMLAND);

  public static final BlockState FARMLAND_1 = new BlockState((short) 3366, Block.FARMLAND);

  public static final BlockState FARMLAND_2 = new BlockState((short) 3367, Block.FARMLAND);

  public static final BlockState FARMLAND_3 = new BlockState((short) 3368, Block.FARMLAND);

  public static final BlockState FARMLAND_4 = new BlockState((short) 3369, Block.FARMLAND);

  public static final BlockState FARMLAND_5 = new BlockState((short) 3370, Block.FARMLAND);

  public static final BlockState FARMLAND_6 = new BlockState((short) 3371, Block.FARMLAND);

  public static final BlockState FARMLAND_7 = new BlockState((short) 3372, Block.FARMLAND);

  public static void initStates() {
    Block.FARMLAND.addBlockState(FARMLAND_0);
    Block.FARMLAND.addBlockState(FARMLAND_1);
    Block.FARMLAND.addBlockState(FARMLAND_2);
    Block.FARMLAND.addBlockState(FARMLAND_3);
    Block.FARMLAND.addBlockState(FARMLAND_4);
    Block.FARMLAND.addBlockState(FARMLAND_5);
    Block.FARMLAND.addBlockState(FARMLAND_6);
    Block.FARMLAND.addBlockState(FARMLAND_7);
  }
}
