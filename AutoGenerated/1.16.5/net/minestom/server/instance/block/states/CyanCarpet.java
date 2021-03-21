package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CyanCarpet {
  public static final BlockState CYAN_CARPET_0 = new BlockState((short) 7879, Block.CYAN_CARPET);

  public static void initStates() {
    Block.CYAN_CARPET.addBlockState(CYAN_CARPET_0);
  }
}
