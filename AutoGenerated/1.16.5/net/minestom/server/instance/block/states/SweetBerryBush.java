package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SweetBerryBush {
  public static final BlockState SWEET_BERRY_BUSH_0 = new BlockState((short) 14962, Block.SWEET_BERRY_BUSH);

  public static final BlockState SWEET_BERRY_BUSH_1 = new BlockState((short) 14963, Block.SWEET_BERRY_BUSH);

  public static final BlockState SWEET_BERRY_BUSH_2 = new BlockState((short) 14964, Block.SWEET_BERRY_BUSH);

  public static final BlockState SWEET_BERRY_BUSH_3 = new BlockState((short) 14965, Block.SWEET_BERRY_BUSH);

  public static void initStates() {
    Block.SWEET_BERRY_BUSH.addBlockState(SWEET_BERRY_BUSH_0);
    Block.SWEET_BERRY_BUSH.addBlockState(SWEET_BERRY_BUSH_1);
    Block.SWEET_BERRY_BUSH.addBlockState(SWEET_BERRY_BUSH_2);
    Block.SWEET_BERRY_BUSH.addBlockState(SWEET_BERRY_BUSH_3);
  }
}
