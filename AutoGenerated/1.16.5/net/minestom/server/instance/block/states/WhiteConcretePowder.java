package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WhiteConcretePowder {
  public static final BlockState WHITE_CONCRETE_POWDER_0 = new BlockState((short) 9458, Block.WHITE_CONCRETE_POWDER);

  public static void initStates() {
    Block.WHITE_CONCRETE_POWDER.addBlockState(WHITE_CONCRETE_POWDER_0);
  }
}
