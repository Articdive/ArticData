package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Tnt {
  public static final BlockState TNT_0 = new BlockState((short) 1430, Block.TNT);

  public static final BlockState TNT_1 = new BlockState((short) 1431, Block.TNT);

  public static void initStates() {
    Block.TNT.addBlockState(TNT_0);
    Block.TNT.addBlockState(TNT_1);
  }
}
