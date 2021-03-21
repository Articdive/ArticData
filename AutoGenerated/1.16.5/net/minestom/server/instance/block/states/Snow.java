package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Snow {
  public static final BlockState SNOW_0 = new BlockState((short) 3921, Block.SNOW);

  public static final BlockState SNOW_1 = new BlockState((short) 3922, Block.SNOW);

  public static final BlockState SNOW_2 = new BlockState((short) 3923, Block.SNOW);

  public static final BlockState SNOW_3 = new BlockState((short) 3924, Block.SNOW);

  public static final BlockState SNOW_4 = new BlockState((short) 3925, Block.SNOW);

  public static final BlockState SNOW_5 = new BlockState((short) 3926, Block.SNOW);

  public static final BlockState SNOW_6 = new BlockState((short) 3927, Block.SNOW);

  public static final BlockState SNOW_7 = new BlockState((short) 3928, Block.SNOW);

  public static void initStates() {
    Block.SNOW.addBlockState(SNOW_0);
    Block.SNOW.addBlockState(SNOW_1);
    Block.SNOW.addBlockState(SNOW_2);
    Block.SNOW.addBlockState(SNOW_3);
    Block.SNOW.addBlockState(SNOW_4);
    Block.SNOW.addBlockState(SNOW_5);
    Block.SNOW.addBlockState(SNOW_6);
    Block.SNOW.addBlockState(SNOW_7);
  }
}
