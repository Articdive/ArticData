package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Cake {
  public static final BlockState CAKE_0 = new BlockState((short) 4024, Block.CAKE);

  public static final BlockState CAKE_1 = new BlockState((short) 4025, Block.CAKE);

  public static final BlockState CAKE_2 = new BlockState((short) 4026, Block.CAKE);

  public static final BlockState CAKE_3 = new BlockState((short) 4027, Block.CAKE);

  public static final BlockState CAKE_4 = new BlockState((short) 4028, Block.CAKE);

  public static final BlockState CAKE_5 = new BlockState((short) 4029, Block.CAKE);

  public static final BlockState CAKE_6 = new BlockState((short) 4030, Block.CAKE);

  public static void initStates() {
    Block.CAKE.addBlockState(CAKE_0);
    Block.CAKE.addBlockState(CAKE_1);
    Block.CAKE.addBlockState(CAKE_2);
    Block.CAKE.addBlockState(CAKE_3);
    Block.CAKE.addBlockState(CAKE_4);
    Block.CAKE.addBlockState(CAKE_5);
    Block.CAKE.addBlockState(CAKE_6);
  }
}
