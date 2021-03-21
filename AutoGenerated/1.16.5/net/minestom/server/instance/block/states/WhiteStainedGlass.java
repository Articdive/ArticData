package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class WhiteStainedGlass {
  public static final BlockState WHITE_STAINED_GLASS_0 = new BlockState((short) 4095, Block.WHITE_STAINED_GLASS);

  public static void initStates() {
    Block.WHITE_STAINED_GLASS.addBlockState(WHITE_STAINED_GLASS_0);
  }
}
