package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WhiteConcrete {
  public static final BlockState WHITE_CONCRETE_0 = new BlockState((short) 9442, Block.WHITE_CONCRETE);

  public static void initStates() {
    Block.WHITE_CONCRETE.addBlockState(WHITE_CONCRETE_0);
  }
}
